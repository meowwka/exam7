package kg.attractor.orders.service;


import kg.attractor.orders.DTO.CustomerDTO;
import kg.attractor.orders.model.Customer;
import kg.attractor.orders.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {
    @Autowired
    private CustomerRepo crepo;

    public Slice<CustomerDTO> findCustomers(Pageable pageable){
        var slice =crepo.findAll( pageable);
        return slice.map(CustomerDTO::from);
    }


}
