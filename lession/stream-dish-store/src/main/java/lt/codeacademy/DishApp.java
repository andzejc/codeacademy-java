package lt.codeacademy;

import lt.codeacademy.factory.DishFactory;
import lt.codeacademy.service.DishService;

public class DishApp {

    private final DishService dishService = new DishService(new DishFactory());

    public void run() {
        dishService.getAll()
                .forEach(dish -> System.out.println(dish.toString()));
    }

}
