
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BurgerTest {
    Burger burger;
    Bun bun = new Bun("Вишневая", 230);
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Капустный", 80);
    Ingredient secondIngredient = new Ingredient(IngredientType.FILLING, "Паштет", 380);

    @BeforeEach
    public void createBurger() {
        burger = new Burger();
    }

    @Test
    @DisplayName("Проверка,что addIngredient() добавляет новый ингридиент")
    public void addIngredientSuccess() {
        burger.addIngredient(ingredient);
        assertEquals(1, burger.ingredients.size(), "Ингредиент не добавился в список");
        assertEquals(ingredient, burger.ingredients.get(0), "Добавлен неправильный ингредиент");
    }

    @Test
    @DisplayName("Проверка, что moveIngredient () заменяет ингридиенты")
    public void moveIngredientSuccess() {
        burger.addIngredient(ingredient);
        burger.addIngredient(secondIngredient);
        burger.moveIngredient(0, 1);
        assertEquals(secondIngredient, burger.ingredients.get(0), "Порядок ингридиентов не поменялся");
    }

    @Test
    @DisplayName("Проверка, что removeIngredient () удаляет ингридиенты")
    public void removeIngredientSuccess() {
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        assertEquals(0, burger.ingredients.size(), "Ингридиент не удален из списка");
    }

    @Test
    @DisplayName("Проверка возврата стоимости бургера")
    public void getPriceSuccess() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        float price = burger.getPrice();
        float expectedPrice = (bun.getPrice() * 2) + ingredient.getPrice();
        assertEquals(expectedPrice, price, "Полученная сумма не соответствует действительности");
    }

    @Test
    @DisplayName("Проверка рецепта")
    public void getReceiptSuccess() {
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        String receipt = burger.getReceipt();
        System.out.println(receipt);
    }
}
