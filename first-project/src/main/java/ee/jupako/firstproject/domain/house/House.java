package ee.jupako.firstproject.domain.house;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class House {

    private String size;
    private String city;
    private String number;

}
