import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import praktikum.Database;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {
    @Test
    @DisplayName("Проверка количества доступных булочек")
    public void availableBunsSuccess() {
        Database database = new Database();
        assertEquals(3, database.availableBuns().size());
    }

    @Test
    @DisplayName("Проверка количества доступных ингридиентов")
    public void availableIngredientsSuccess() {
        Database database = new Database();
        assertEquals(6, database.availableIngredients().size());
    }
}