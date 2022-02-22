package lt.codeacademy.service;

import lt.codeacademy.dto.DishDto;
import lt.codeacademy.factory.DishFactory;
import lt.codeacademy.model.Dish;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DishServiceTest {

    @Test
    public void getAll_ShouldReturnValidSet() {
        // given
        List<Dish> dishes = List.of(
                new Dish(1, "NR-01", "Cepelinai", BigDecimal.valueOf(5)),
                new Dish(2, "NR-02", "Zemaiciu blynai", BigDecimal.valueOf(9))
        );
        DishFactory dishFactory = new DishFactory(dishes);
        DishService dishService = new DishService(dishFactory);

        // when
        Set<Dish> result = dishService.getAll();

        // then
        assertTrue(result.size() == 2);
    }

    @Test
    public void getAllDishDto() {
        // given
        List<Dish> dishes = List.of(
                new Dish(1, "NR-02", "Cepelinai", BigDecimal.valueOf(5))
        );
        DishFactory dishFactory = new DishFactory(dishes);
        DishService dishService = new DishService(dishFactory);

        // when
        List<DishDto> result = dishService.getAllDishDto();
        String dishName = result.get(0).getDishNrWithName();

        // then
        assertEquals("[NR-02] Cepelinai", dishName);
    }
}
