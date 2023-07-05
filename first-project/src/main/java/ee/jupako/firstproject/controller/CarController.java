package ee.jupako.firstproject.controller;

import ee.jupako.firstproject.domain.car.Car;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/car")
public class CarController {

    @PostMapping
    public String save(@RequestBody Car car) {
        System.out.println("We have got: " + car.getBrand());

        return "Added!";
    }

}
