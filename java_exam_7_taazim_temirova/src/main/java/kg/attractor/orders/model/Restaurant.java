package kg.attractor.orders.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;

@Data
@Document(collection = "restaurants")
public class Restaurant {
    @Id
    private String id = UUID.randomUUID().toString();
    private String title;
    private  String description;
    @DBRef
    private List<Dish> dishes;


}
