package lt.codeacademy.service;

import lt.codeacademy.dto.DishDto;
import lt.codeacademy.factory.DishFactory;
import lt.codeacademy.mapper.DishMapper;
import lt.codeacademy.model.Dish;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DishService {

    private final List<Dish> dishes;
    private final DishMapper dishMapper = new DishMapper();

    public DishService(DishFactory factory) {
        this.dishes = factory.getDishes();
    }

    public Set<Dish> getAll() {
        // old way
        /*Set<Dish> dishSet = new HashSet<>();
        for (Dish dish: dishes) {
            dishSet.add(dish);
        }
        return dishSet;*/

        // stream way
        return dishes.stream()
                .collect(Collectors.toSet());
    }

    public List<DishDto> getAllDishDto() {
        return dishes.stream()
                .map(dish -> dishMapper.toDto(dish))
                .collect(Collectors.toList());
    }
}
