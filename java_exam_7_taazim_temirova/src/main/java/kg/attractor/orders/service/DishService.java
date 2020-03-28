package kg.attractor.orders.service;


import kg.attractor.orders.DTO.DishDTO;
import kg.attractor.orders.model.Dish;
import kg.attractor.orders.repository.DishRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
public class DishService {
    @Autowired
    private DishRepo drepo;

    public Page<DishDTO> findDishesByRestaurant(String dish, Pageable p){
        var slice = drepo.findAllDishTitleByRestaurant(dish,p);
        return slice.map(DishDTO::from);
    }
}
