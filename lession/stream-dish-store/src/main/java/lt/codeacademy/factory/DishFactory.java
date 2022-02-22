package lt.codeacademy.factory;

import lt.codeacademy.model.Dish;

import java.math.BigDecimal;
import java.util.List;

public final class DishFactory {

    public List<Dish> getAvailableDishes() {
        return List.of(
                new Dish(1, "Cepelinai", BigDecimal.valueOf(5)),
                new Dish(2, "Zemaiciu blynai", BigDecimal.valueOf(9)),
                new Dish(3, "Saltibarsciai", BigDecimal.valueOf(2.5)),
                new Dish(4, "Kugelis", BigDecimal.valueOf(7)),
                new Dish(5, "Vedarai", BigDecimal.valueOf(6.99)),
                new Dish(6, "Saslikai", BigDecimal.valueOf(10)),
                new Dish(7, "Alus (0%)", BigDecimal.valueOf(3)),
                new Dish(8, "Vanduo", BigDecimal.valueOf(0.20))
        );
    }
}
