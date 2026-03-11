import jdk.jfr.Description;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import praktikum.Bun;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BunTest {

    @ParameterizedTest
    @Description("Проверка, что getName() возвращает название булочки")
    @MethodSource("provider")

    public void getNameBunSuccess(String name, float price) {
        Bun bun = new Bun(name, price);
        String nameBun = bun.getName();
        assertEquals(name, nameBun, "Неправильное название булочки");
    }

    @ParameterizedTest
    @Description("Проверка, что getPrice() возвращает стоимость булочки")
    @MethodSource("provider")
    public void getPriceBunSuccess(String name, float price) {
        Bun bun = new Bun(name, price);
        float priceBun = bun.getPrice();
        assertEquals(price, priceBun, "Неверная стоимость булочки");
    }

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of("Апельсиновая", 500),
                Arguments.of("Банановая", 120),
                Arguments.of("Сухая", 1));
    }
}