package kg.attractor.orders.controller;

import kg.attractor.orders.DTO.DishDTO;
import kg.attractor.orders.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("dishes")
public class DishController {
    @Autowired
    private DishService ds;



    @GetMapping("/{dish}")
    public Slice<DishDTO> findDishByRestaurant(@PathVariable String dish, @ApiIgnore Pageable pageable){
        return ds.findDishesByRestaurant(dish,pageable);

    }
}
