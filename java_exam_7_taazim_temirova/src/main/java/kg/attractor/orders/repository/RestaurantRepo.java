package kg.attractor.orders.repository;

import kg.attractor.orders.model.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RestaurantRepo extends PagingAndSortingRepository<Restaurant ,String > {
    Page<Restaurant> findByTitle(Pageable name);
}
