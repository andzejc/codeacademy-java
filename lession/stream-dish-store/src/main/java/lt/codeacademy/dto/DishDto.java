package lt.codeacademy.dto;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class DishDto {
    private final String dishNrWithName;
    private final BigDecimal price;

    public DishDto(String dishNrWithName, BigDecimal price) {
        this.dishNrWithName = dishNrWithName;
        this.price = price;
    }
}
