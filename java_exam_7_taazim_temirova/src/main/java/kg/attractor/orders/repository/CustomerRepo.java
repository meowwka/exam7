package kg.attractor.orders.repository;

import kg.attractor.orders.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepo extends PagingAndSortingRepository<Customer, String> {

}
