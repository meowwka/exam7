package kg.attractor.orders.DTO;

import kg.attractor.orders.model.Dish;
import kg.attractor.orders.model.Restaurant;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
@Builder(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)

public class RestaurantDTO {
    private String title;
    private  String description;
//    private String dishes;


    public static RestaurantDTO from(Restaurant r){
        return builder().description(r.getDescription())
                .title(r.getTitle())
//                .dishes(r.getDish().getDishTitle())
                .build();
    }
}
