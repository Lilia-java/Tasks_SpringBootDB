package hw.repository;

import hw.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByName(String name);

    @Query(value = "SELECT * FROM  books b WHERE b.name = :name", nativeQuery = true)
    List<Book> retrieveByName(@Param("name") String name);

    //List<Book> findByPrice(int price);

    @Query(value = "select b.name,b.price from books b where (b.name like '%Windows%' or b.price>:price) order by b.name,b.price desc", nativeQuery = true)
    List<Book> findByPrice(@Param("price") int price);

    /*List<Book> getAllBooks;
    @Query(value = "select distinct name, price from books", nativeQuery = true)
    List<Book> getAllBooks;*/

    @Query(value = "select b.name,b.storage,b.quentity,b.price from books b,shops s,orders o where o.customer=b.id and o.seller=s.id and b.storage=s.district and b.quentity>:quentity order by b.price", nativeQuery = true)
    List<Book> findByQuentity(@Param("quentity") int quentity);

    @Query(value = "select distinct b.name, b.price from books b", nativeQuery = true)
    List<Book> findAllBooks();
}
