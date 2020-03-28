package kg.attractor.orders.service;


import kg.attractor.orders.DTO.CustomerDTO;
import kg.attractor.orders.model.Customer;
import kg.attractor.orders.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo crepo;

//    public CustomerDTO addCustomer( CustomerDTO customerDTO){
//        var customers = Customer.builder().email(customerDTO.getEmail())
//                .name(customerDTO.getName()).build();
//        crepo.save(customers);
//        return CustomerDTO.from(customers);
//
//    }
}
