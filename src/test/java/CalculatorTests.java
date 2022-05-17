import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class CalculatorTests {

    Calculator sut = new Calculator();

    @Test
    @DisplayName("Sum Test")
    void testPlus_success() {
        int a = 5;
        int b = 2;
        int expected = 7;
        int c = sut.plus.apply(a, b);

        Assertions.assertEquals(expected, c);
    }

    @ParameterizedTest
    @DisplayName("Parameterized sum Test")
    @ValueSource(ints = {1, 3, 5, -3, 15, 42, 1_123_432})
    void parameterizedTestPlus_success(int number) {
        int c = sut.plus.apply(number, number);

        Assertions.assertEquals(number + number, c);
    }

    @Test
    @DisplayName("Subtraction test")
    void testMinus_success() {
        int a = 15;
        int b = 27;
        int expected = -12;

        int c = sut.minus.apply(a, b);

        Assertions.assertEquals(expected, c);
    }

    @Test
    @DisplayName("Multiplication test")
    void testMultiply_success() {
        int a = 824;
        int b = 8_916;
        int expected = 7_346_784;

        int c = sut.multiply.apply(a, b);

        Assertions.assertEquals(expected, c);
    }

    @Test
    @DisplayName("Division test")
    void testDevide_success() {
        int a = 27;
        int b = 3;
        int expected = 9;

        int c = sut.devide.apply(a, b);
        Assertions.assertEquals(expected, c);
    }

    @Test
    @DisplayName("Division by zero")
    void testDevideByZero_success() {
        int a = 5;
        int b = 0;

        sut.devide.apply(a, b);
    }
}
