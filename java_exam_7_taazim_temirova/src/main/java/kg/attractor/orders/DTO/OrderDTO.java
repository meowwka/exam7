package kg.attractor.orders.DTO;

import kg.attractor.orders.model.Customer;
import kg.attractor.orders.model.Dish;
import kg.attractor.orders.model.Order;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)

public class OrderDTO {
    private String restaurand;
    @DBRef
    private String dish;
    private LocalDateTime orderDate;

    public static OrderDTO from(Order order){
        return  builder().
                restaurand(order.getDish().getRestaurant().getTitle())
                .dish(order.getDish().getDishTitle())
                .orderDate(order.getOrderDate())
                .build();

    }
}
