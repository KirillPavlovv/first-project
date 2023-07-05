package ee.jupako.firstproject.domain.student;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Student {

    private String firstName;
    private String lastName;
    private String idNumber;

}
