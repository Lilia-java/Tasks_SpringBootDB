package hw.service;

import hw.entity.Order;
import hw.repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        return orderRepository.findAll();
    }

    public Order findById(int id){
        Optional<Order> optional = orderRepository.findById(id);
        return optional.orElse(new Order());
    }

    public List<Order> findByName(String name){
        return orderRepository.findByName(name);
    }

    public void save(Order order){
        orderRepository.save(order);
    }

    public List<Order> retrieveByName(String name){
        return orderRepository.retrieveByName(name);
    }

    public List<Order> findBySum(int sum){
        //sum=60000;
        return orderRepository.findBySum(sum);
    }

    public List<Order> findByDateOrd(String date){
        //date="01.03.2019";
        return orderRepository.findByDateOrd(date);
    }

    public List<Order> findAllDates(){
        return orderRepository.findAllDates();
    }

    public List<Order> findAllCustomerAndSeller(){
        return orderRepository.findAllCustomerAndSeller();
    }

    public List<Order> findAllSellingBook(){
        return orderRepository.findAllSellingBook();
    }

}
