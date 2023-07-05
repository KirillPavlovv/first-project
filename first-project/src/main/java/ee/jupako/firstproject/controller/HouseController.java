package ee.jupako.firstproject.controller;

import ee.jupako.firstproject.domain.house.House;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/house")
public class HouseController {

    @PostMapping
    public String save(@RequestBody House house) {
        System.out.println("Zaregestrirovan House: " + house.getCity() + house.getNumber() + house.getSize());

        return "Done. City " + house.getCity() + ", House number " + house.getNumber() + ", Squre " + house.getSize() + ".";
    }
}
