import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Малиновый", 500);

    @Test
    @DisplayName("Проверка метода getPrice(), что он корректно возвращает стоимость ингридиента")
    public void getPriceSuccess() {
        float price = ingredient.getPrice();
        assertEquals(500, price, "Сумма не соответствует действительности");
    }

    @Test
    @DisplayName("Проверка метода getName(), что он корректно возвращает правильное наименование ингридиента")
    public void getNameSuccess() {
        String name = ingredient.getName();
        assertEquals("Малиновый", name, "Сумма не соответствует действительности");
    }

    @Test
    @DisplayName("Проверка метода getType(), что он корректно возвращает правильный ингридиента")
    public void getTypeSuccess() {
        IngredientType type = ingredient.getType();
        assertEquals(IngredientType.SAUCE, type, "Неверный тип продукта");
    }
}
