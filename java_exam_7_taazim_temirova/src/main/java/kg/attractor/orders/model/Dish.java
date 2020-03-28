package kg.attractor.orders.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "dishes")
public class Dish {
    @Id
    private String id = UUID.randomUUID().toString();
    private String dishTitle;
    private String dishType;
    private int price;
    @DBRef
    private  Restaurant restaurant;


    public Dish(Restaurant restaurant, String dishTitle, String dishType, int price) {
        this.dishTitle=dishTitle;
        this.dishType=dishType;
        this.price = price;
        this.restaurant=restaurant;

    }
}
