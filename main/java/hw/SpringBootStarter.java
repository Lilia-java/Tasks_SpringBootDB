package hw;


import hw.entity.Book;
import hw.service.BookService;
import hw.service.CustomerService;
import hw.service.OrderService;
import hw.service.ShopService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarter implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringBootStarter.class);

    @Autowired
    private BookService bookService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private ShopService shopService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStarter.class, args);
    }

    @Override
    public void run(String... args) {

        log.info("find all books");
        bookService.findAll().forEach(System.out::println);

        log.info("find by id");
        System.out.println(bookService.findById(2));

        log.info("find by book`s name");
        bookService.findByName("Harry Potter").forEach(System.out::println);

        log.info("save new book");
        bookService.save(new Book("Компьютерные сети",5000,"Нижегородский",20));

        log.info("retreive by name");
        bookService.retrieveByName("Гарри Поттер").forEach(System.out::println);

        log.info("find books quentity>10");
        bookService.findByQuentity(10).forEach(System.out::println);

        log.info("find books with price>20000 or name with word 'Windows'");
        bookService.findByPrice(20000).forEach(System.out::println);

        log.info("find all books and prices");
        bookService.findAllBooks().forEach(System.out::println);

        log.info("find all districts");
        customerService.findAllDistricts().forEach(System.out::println);

        log.info("find by district`s name like 'Нижегородский'");
        customerService.findByDistrict("Нижегородский").forEach(System.out::println);

        log.info("find shops not in 'Автозаводский'");
        customerService.findByDiscount(10).forEach(System.out::println);

        log.info("find all customer`s name and shops");
        orderService.findAllCustomerAndSeller().forEach(System.out::println);

        log.info("find all months with orders");
        orderService.findAllDates().forEach(System.out::println);

        log.info("find all buying books");
        orderService.findAllSellingBook().forEach(System.out::println);

        log.info("find all buying books since 01.03.2019");
        orderService.findByDateOrd("01.03.2019").forEach(System.out::println);

        log.info("find all orders with sum >= 60000");
        orderService.findBySum(60000).forEach(System.out::println);

        log.info("find shops from 'Сормовский' and 'Советский'");
        shopService.findByDistrict("Сормовский").forEach(System.out::println);

    }
}

