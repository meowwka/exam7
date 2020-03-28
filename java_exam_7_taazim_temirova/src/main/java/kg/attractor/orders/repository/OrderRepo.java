package kg.attractor.orders.repository;

import kg.attractor.orders.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepo extends PagingAndSortingRepository<Order, String> {
}
