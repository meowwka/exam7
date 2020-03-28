package kg.attractor.orders.service;

import kg.attractor.orders.DTO.CustomerDTO;
import kg.attractor.orders.DTO.OrderDTO;
import kg.attractor.orders.model.Dish;
import kg.attractor.orders.model.Order;
import kg.attractor.orders.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
private OrderRepo or;

    public Slice<OrderDTO> findByCustomerID(String customerId, Pageable pageable){
        var order = or.findAllByCustomer_Id(customerId, pageable);
        return  order.map(OrderDTO::from);
    }

    public Slice<OrderDTO> findOrders(Pageable pageable){
        var slice =or.findAll( pageable);
        return slice.map(OrderDTO::from);
    }
}
