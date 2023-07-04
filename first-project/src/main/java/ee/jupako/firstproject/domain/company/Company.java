package ee.jupako.firstproject.domain.company;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Company {
    private String name;
    private String city;
    private String phoneNumber;
}
