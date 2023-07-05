package ee.jupako.firstproject.controller;

import ee.jupako.firstproject.domain.company.Company;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @PostMapping
    public String save(@RequestBody Company company) {
        System.out.println("MQ POLUCHILI Company: " + company.getName());

        return "Done " + company.getName();
    }
}
