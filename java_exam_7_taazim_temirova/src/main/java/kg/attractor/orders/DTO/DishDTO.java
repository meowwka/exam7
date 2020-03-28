package kg.attractor.orders.DTO;

import kg.attractor.orders.model.Dish;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DishDTO {
    private String dishTitle;
    private String dishType;
    private int price;

    public static DishDTO from(Dish dish){
        return  builder().dishTitle(dish.getDishTitle())
                .dishType(dish.getDishType())
                .price(dish.getPrice())
                .build();
    }
}
