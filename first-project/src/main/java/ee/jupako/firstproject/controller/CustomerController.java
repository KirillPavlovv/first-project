package ee.jupako.firstproject.controller;

import ee.jupako.firstproject.domain.customer.Customer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @PostMapping
    public String save(@RequestBody Customer customer) {
        System.out.println("MQ POLUCHILI Customersa: " + customer.getFirstName());

        return "Udachno DOBAVLEN!";
    }

}

