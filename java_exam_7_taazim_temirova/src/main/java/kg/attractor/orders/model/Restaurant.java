package kg.attractor.orders.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;


@Document(collection = "restaurants")
@Data
public class Restaurant {
    @Id
    private String id = UUID.randomUUID().toString();
    private String title;
    private  String description;
//    private Dish dish;

    public  Restaurant(String title, String description
//            , Dish dish
    ){
        this.title=title;
        this.description=description;
//        this.dish= dish;


    }




}
