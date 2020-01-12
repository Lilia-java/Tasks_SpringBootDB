package hw.service;

import hw.entity.Shop;
import hw.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {


    @Autowired
    private ShopRepository shopRepository;

    public List<Shop> findAll(){
        return shopRepository.findAll();
    }

    public Shop findById(int id){
        Optional<Shop> optional = shopRepository.findById(id);
        return optional.orElse(new Shop());
    }

    public List<Shop> findByName(String name){
        return shopRepository.findByName(name);
    }

    public void save(Shop shop){
        shopRepository.save(shop);
    }

    public List<Shop> retrieveByName(String name){
        return shopRepository.retrieveByName(name);
    }

    public List<Shop> findByDistrict(String district) {
            //district = "Сормовский";
            return shopRepository.findByDistrict(district);

    }

}
 