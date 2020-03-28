package kg.attractor.orders.util;


import kg.attractor.orders.DTO.CustomerDTO;
import kg.attractor.orders.model.Customer;
import kg.attractor.orders.model.Dish;
import kg.attractor.orders.model.Order;
import kg.attractor.orders.model.Restaurant;
import kg.attractor.orders.repository.CustomerRepo;
import kg.attractor.orders.repository.DishRepo;
import kg.attractor.orders.repository.OrderRepo;
import kg.attractor.orders.repository.RestaurantRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

@Configuration
public class InitDataBase {
    private final Random r = new Random();



    @Bean
    CommandLineRunner init(CustomerRepo cr, DishRepo dr, OrderRepo or, RestaurantRepo rr){
        return (args) ->{
            cr.deleteAll();
            dr.deleteAll();
            or.deleteAll();
            rr.deleteAll();

            List<Restaurant> restaurants = new ArrayList<>();

            List<Customer> customers =  new ArrayList<>();
//            Stream.generate(Customer::random)
//                    .collect(toList());
//            cr.saveAll(customers);
            for(int i = 0; i < 10; i++){
                Customer customer = new Customer(GenerateData.randomPersonName(), GenerateData.randomEmail());
                customers.add(customer);
            }
            cr.saveAll(customers);

            for(int i = 0; i < r.nextInt(10)+2; i++){
                GenerateData.PlaceName placeName = GenerateData.randomPlace();
                Restaurant restaurant = new Restaurant(placeName.name, placeName.description);
                restaurants.add(restaurant);
            }
            rr.saveAll(restaurants);

            List<Dish> dishes = new ArrayList<>();
            int dishesAmount = r.nextInt(20)+5;
            for(int i = 0; i < dishesAmount; i ++){
                GenerateData.DishName dishName = GenerateData.randomDish();
                Restaurant restaurantRandom = restaurants.get(r.nextInt(restaurants.size()));
                int price = r.nextInt(100)+50;
                Dish dish = new Dish(restaurantRandom, dishName.name.trim(), dishName.type.trim(), price);
                dishes.add(dish);
            }
            dr.saveAll(dishes);

            List<Order> orders  = new ArrayList<>();
            for(int i = 0 ; i<  r.nextInt(20) +5; i++){
                Dish dish = dishes.get(r.nextInt(dishes.size()));
                Customer customer = customers.get(r.nextInt(customers.size()));
                Order order = new Order(customer, dish);
                orders.add(order);
            }
            or.saveAll(orders);


        };
    }
}
