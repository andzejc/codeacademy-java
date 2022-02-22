package lt.codeacademy.mapper;

import lt.codeacademy.dto.DishDto;
import lt.codeacademy.model.Dish;

public class DishMapper {

    public DishDto toDto(Dish dish) {
        String formattedName = String.format("[%s] %s", dish.getDishNumber(), dish.getName());
        return new DishDto(formattedName, dish.getPrice());
    }
}
