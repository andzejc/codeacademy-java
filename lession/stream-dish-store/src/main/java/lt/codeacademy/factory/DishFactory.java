package lt.codeacademy.factory;

import lombok.Getter;
import lt.codeacademy.model.Dish;

import java.math.BigDecimal;
import java.util.List;

@Getter
public final class DishFactory {

    private final List<Dish> dishes;

    public DishFactory(List<Dish> dishes) {
        this.dishes = dishes;
    }

    public static List<Dish> getAvailableDishes() {
        return List.of(
                new Dish(1, "NR-01", "Cepelinai", BigDecimal.valueOf(5)),
                new Dish(2, "NR-02", "Zemaiciu blynai", BigDecimal.valueOf(9)),
                new Dish(3, "NR-03", "Saltibarsciai", BigDecimal.valueOf(2.5)),
                new Dish(4, "NR-04", "Kugelis", BigDecimal.valueOf(7)),
                new Dish(5, "NR-05", "Vedarai", BigDecimal.valueOf(6.99)),
                new Dish(6, "NR-06", "Saslikai", BigDecimal.valueOf(10)),
                new Dish(7, "NR-07", "Alus (0%)", BigDecimal.valueOf(3)),
                new Dish(8, "NR-08", "Vanduo", BigDecimal.valueOf(0.20))
        );
    }
}
