package hw.service;

import hw.entity.Book;
import hw.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;


    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Book findById(int id){
        Optional<Book> optional = bookRepository.findById(id);
        return optional.orElse(new Book());
    }

    public List<Book> findByName(String name){
        return bookRepository.findByName(name);
    }

    public void save(Book book){
        bookRepository.save(book);
    }

    public List<Book> retrieveByName(String name){
        return bookRepository.retrieveByName(name);
    }

    public List<Book> findByPrice(int price){
        //price = 20000;
        return bookRepository.findByPrice(price);
    }

    public List<Book> findByQuentity(int quentity){
        //quentity = 10;
        return bookRepository.findByQuentity(quentity);
    }

    public List<Book> findAllBooks(){
        return bookRepository.findAllBooks();
    }

}
