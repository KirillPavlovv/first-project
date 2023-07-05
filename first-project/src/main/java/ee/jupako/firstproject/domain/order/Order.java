package ee.jupako.firstproject.domain.order;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {

    private String name;
    private String date;
    private String orderId;

}
