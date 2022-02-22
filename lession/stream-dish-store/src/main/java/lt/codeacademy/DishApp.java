package lt.codeacademy;

import lt.codeacademy.factory.DishFactory;
import lt.codeacademy.service.DishService;

public class DishApp {

    private final DishService dishService = new DishService(
            new DishFactory(DishFactory.getAvailableDishes())
    );

    public void run() {

    }

}
