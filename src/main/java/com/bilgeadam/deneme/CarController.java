package com.bilgeadam.deneme;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@RestController
public class CarController {

    @PersistenceContext
    private EntityManager entityManager;

    @Modifying
    @PostConstruct
    public void init() {
        Car car = new Car();
        car.setName("Araba");
        car.setPlate("06CRC188");
        car.setVendor("Mercedes");
        Query query = entityManager.createNativeQuery("insert into car(id, name, vendor, plate) values(2,'araba','mercedes'," +
                " '06CRC188')");
        query.executeUpdate();
    }

//    @GetMapping()
//    public List<Car> getCars() {
//        entityManager.createNativeQuery("")
//    }
}
