package ee.jupako.firstproject.controller;

import ee.jupako.firstproject.domain.order.Order;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")

public class OrderController {

    @PostMapping
    public String save(@RequestBody Order order) {
        System.out.println("New order: " + order.getOrderId());

        return "Added";
    }
}
