package kg.attractor.orders.controller;

import kg.attractor.orders.DTO.OrderDTO;
import kg.attractor.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController

@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService os;

    @GetMapping
    public Slice<OrderDTO> findAll( @ApiIgnore Pageable pageable){
        return os.findOrders(pageable);
    }

    @GetMapping("/{customerId}")
    public Slice<OrderDTO> findByCustomerId(@PathVariable String customerId , @ApiIgnore Pageable pageable){
        return os.findByCustomerID(customerId,pageable);

    }
}
