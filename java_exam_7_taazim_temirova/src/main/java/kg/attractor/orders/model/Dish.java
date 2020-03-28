package kg.attractor.orders.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
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
}
