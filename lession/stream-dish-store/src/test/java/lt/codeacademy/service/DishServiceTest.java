package lt.codeacademy.service;

import lt.codeacademy.factory.DishFactory;
import lt.codeacademy.model.Dish;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class DishServiceTest {

    private DishFactory dishFactory = new DishFactory();
    private DishService dishService = new DishService(dishFactory);

    @Test
    public void getAll_ShouldReturnValidSet() {
        // when
        Set<Dish> dishes = dishService.getAll();

        // then
        assertTrue(dishes.size() != 0);
    }
}
