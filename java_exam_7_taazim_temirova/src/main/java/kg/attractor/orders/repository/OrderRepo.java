package kg.attractor.orders.repository;

import kg.attractor.orders.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderRepo extends PagingAndSortingRepository<Order, String> {
    Page<Order> findAllByCustomer_Id(String customerId , Pageable pageable);
}
