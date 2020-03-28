package kg.attractor.orders.repository;

import kg.attractor.orders.model.Dish;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DishRepo extends PagingAndSortingRepository<Dish, String> {
     Page<Dish> findAllDishTitleByRestaurant(String dish,Pageable pageable);
}
