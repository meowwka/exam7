package kg.attractor.orders.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Document(collection = "orders")
public class Order {
    @Id
    private String id = UUID.randomUUID().toString();
    @DBRef
    private Customer customer;
    @DBRef
    private Dish dish;
    private LocalDateTime orderDate;
}
