package kg.attractor.orders.service;

import kg.attractor.orders.DTO.RestaurantDTO;
import kg.attractor.orders.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepo rr;

    public Slice<RestaurantDTO> findRestaurants(Pageable pageable){
        var slice =rr.findAll(pageable);
        return slice.map(RestaurantDTO::from);
    }



}
