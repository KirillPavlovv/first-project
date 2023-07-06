package ee.jupako.firstproject.controller;

import ee.jupako.firstproject.domain.student.Student;
import lombok.experimental.Delegate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @PostMapping
    public String save(@RequestBody Student student) {
        System.out.println("Student added: " + student.getFirstName() +  " " + student.getLastName() + " " + student.getIdNumber());

        return "Has been added.";
    }
    @GetMapping
    public List<Student> getAll(){
        System.out.println("Return all students");

        return List.of(new Student("Anton", "Kovalchuk", 1));

    }

    @PutMapping
    public String changeLastName(@RequestParam int idNumber, @RequestParam String lastName) {
        System.out.println("Last name changing: " + lastName);
        return "Last name changed: " + lastName;
    }

    @DeleteMapping
    public String delete(@RequestParam int idNumber) {
        System.out.println("Successfully deleted by id: " + idNumber);

        return "Successfully deleted: " + idNumber;
    }

    @GetMapping("/{idNumber}")
    public Student getByIdNumber(@PathVariable int idNumber) {
        System.out.println("Get student by id " + idNumber);

        return new Student ("Vladislav", "Lebedev", 1);
    }


}



