package lt.codeacademy.model;

import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@ToString
public class Dish {
    private final long id;
    private final String name;
    private final BigDecimal price;

    public Dish(long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
