package hw.repository;

import hw.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    List<Customer> findByName(String name);

    @Query(value = "SELECT * FROM  customers c WHERE c.name = :name", nativeQuery = true)
    List<Customer> retrieveByName(@Param("name") String name);

    @Query(value = "select distinct c.name, c.discount from customers c where district= :district", nativeQuery = true)
    List<Customer> findByDistrict(@Param("district") String district);

    @Query(value = "select s.name from customers c,shops s,orders o where o.customer=c.id and o.seller=s.id and s.district not like 'Автоз%' and c.discount>=:discount and c.discount<='15'", nativeQuery = true)
    List<Customer> findByDiscount(@Param("discount") int discount);

    @Query(value = "select distinct c.district from customers c", nativeQuery = true)
    List<Customer> findAllDistricts();

}