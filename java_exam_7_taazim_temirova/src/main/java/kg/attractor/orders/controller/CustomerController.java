package kg.attractor.orders.controller;

import kg.attractor.orders.DTO.CustomerDTO;
import kg.attractor.orders.annotations.ApiPageable;
import kg.attractor.orders.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService cs;
    @ApiPageable
    @GetMapping("/all")
    public Slice<CustomerDTO> getCustomers(@ApiIgnore Pageable pageable){
        return cs.findCustomers( pageable);
    }

}
