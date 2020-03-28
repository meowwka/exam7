package kg.attractor.orders.controller;


import kg.attractor.orders.DTO.DishDTO;
import kg.attractor.orders.DTO.RestaurantDTO;
import kg.attractor.orders.annotations.ApiPageable;
import kg.attractor.orders.service.DishService;
import kg.attractor.orders.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService rs;
    @Autowired
    private DishService ds;

    @ApiPageable
    @GetMapping("/all")
    public Slice<RestaurantDTO> findRestaurants(@ApiIgnore  Pageable pageable){
        return rs.findRestaurants(pageable);
    }

//    @GetMapping("/{dish}")
//    public Slice<DishDTO> findDishByRestaurant(@PathVariable String dish, @ApiIgnore Pageable pageable){
//        return ds.findDishesByRestaurant(dish,pageable);
//
//    }

}
