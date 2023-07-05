package ee.jupako.firstproject.controller;

import ee.jupako.firstproject.domain.student.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @PostMapping
    public String save(@RequestBody Student student) {
        System.out.println("MQ POLUCHILI Student: " + student.getFirstName());

        return "DOBAVLEN!";
    }
}


