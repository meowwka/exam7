package kg.attractor.orders.DTO;

import kg.attractor.orders.model.Customer;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CustomerDTO {
    private String name;
    private String email;

    public  static CustomerDTO from(Customer customer){
        return builder().email(customer.getEmail())
                .name(customer.getName())
                .build();
    }

}
