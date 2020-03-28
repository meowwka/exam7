package kg.attractor.orders.repository;

import kg.attractor.orders.model.Dish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DishRepo extends PagingAndSortingRepository<Dish, String> {
}
