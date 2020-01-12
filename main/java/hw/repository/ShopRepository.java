package hw.repository;

import hw.entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ShopRepository extends JpaRepository<Shop, Integer> {

    List<Shop> findByName(String name);

    @Query(value = "SELECT * FROM  shops s WHERE s.name = :name", nativeQuery = true)
    List<Shop> retrieveByName(@Param("name") String name);

    @Query(value = "select s.name from shops s where (s.district like :district or s.district like 'Совет%')", nativeQuery = true)
    List<Shop> findByDistrict(@Param("district") String district);


}