package kg.attractor.orders.repository;

import kg.attractor.orders.model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RestaurantRepo extends PagingAndSortingRepository<Restaurant ,String > {
}
