package lt.codeacademy.service;

import lt.codeacademy.factory.DishFactory;
import lt.codeacademy.model.Dish;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DishService {

    private final List<Dish> dishes;

    public DishService(DishFactory factory) {
        this.dishes = factory.getAvailableDishes();
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
}
