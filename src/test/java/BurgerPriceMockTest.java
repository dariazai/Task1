import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BurgerPriceMockTest {

    @Mock
    private Bun bun;

    @Mock
    private Ingredient ingredient1;

    @Mock
    private Ingredient ingredient2;

    @InjectMocks
    private Burger burger;

    @Test
    @DisplayName("Проверка с Mock возврата стоимости бургера")
    void mockGetBurgerPrice() {
        when(bun.getPrice()).thenReturn(50f);
        when(ingredient1.getPrice()).thenReturn(20f);
        when(ingredient2.getPrice()).thenReturn(30f);

        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        float price = burger.getPrice();

        assertEquals(150f, price, "Стоимость бургера посчитана неверно");
    }
}