package kg.attractor.orders.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document(collection = "customers")
public class Customer {
    @Id
    private String id = UUID.randomUUID().toString();
    private String name;
    private String email;

}
