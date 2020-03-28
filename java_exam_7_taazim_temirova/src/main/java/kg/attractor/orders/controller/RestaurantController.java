package kg.attractor.orders.controller;


import kg.attractor.orders.DTO.RestaurantDTO;
import kg.attractor.orders.annotations.ApiPageable;
import kg.attractor.orders.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@RequestMapping("/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService rs;
//    @ApiPageable
//    @GetMapping
//    public Slice<RestaurantDTO> findRestaurants(@ApiIgnore  Pageable pageable){
//        return rs.findRestaurants(pageable);
//    }

}
