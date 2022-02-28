package lt.codeacademy.mapper;

import lt.codeacademy.dto.DishDto;
import lt.codeacademy.model.Dish;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class DishMapperTest {

    @Test
    public void toDto() {
        // given
        DishMapper mapper = new DishMapper();
        Dish dish = new Dish(1, "NR-01", "Cepelinai", BigDecimal.valueOf(5));

        // when
        DishDto dto = mapper.toDto(dish);

        // then
        assertEquals(BigDecimal.valueOf(5), dto.getPrice());
        assertEquals("[NR-01] Cepelinai", dto.getDishNrWithName());
    }
}
