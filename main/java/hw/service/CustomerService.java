package hw.service;

import hw.entity.Customer;
import hw.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

    public Customer findById(int id){
        Optional<Customer> optional = customerRepository.findById(id);
        return optional.orElse(new Customer());
    }

    public List<Customer> findByName(String name){
        return customerRepository.findByName(name);
    }

    public void save(Customer customer){
        customerRepository.save(customer);
    }

    public List<Customer> retrieveByName(String name){
        return customerRepository.retrieveByName(name);
    }

    public List<Customer> findByDistrict(String district){
        //district = "Нижегородский";
        return customerRepository.findByDistrict(district);
    }
    public List<Customer> findAllDistricts(){
        return customerRepository.findAllDistricts();
    }

    public List<Customer> findByDiscount(int discount){
        return customerRepository.findByDiscount(discount);
    }

}
