package kg.attractor.orders.controller;

import kg.attractor.orders.DTO.OrderDTO;
import kg.attractor.orders.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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

//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public OrderDTO addOrder(@RequestBody OrderDTO orderDTO){
//        return  os.
//
//    }
}
