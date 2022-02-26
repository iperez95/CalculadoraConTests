package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductoTest {
    Producto producto;

    @BeforeEach
    void setUp() {
        producto = new Producto();
    }

    @Test
    @DisplayName("Should throw exception when one of values is negative")
    void testProd1ShouldThrowExceptionWhenOneOfValuesIsNegative() {
        Throwable exception = assertThrows(RuntimeException.class, () -> producto.prod1(-1, 2));
        assertEquals("EL NUMERO ES NEGATIVO, NO FUNCIONA LA CALCULADORA", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw exception when one of values is zero")
    void testProd1ShouldThrowExceptionWhenOneOfValuesIsZero() {
        Throwable exception = assertThrows(RuntimeException.class, () -> producto.prod1(0, 2));
        assertEquals("POR CERO NO SE PUEDE MULTIPLICAR", exception.getMessage());
    }

    @Test
    @DisplayName("Should return result when positive numbers are passed")
    void testProd1ShouldReturnResultWhenPositiveNumbersArePassed() {
        double result = producto.prod1(2, 2);
        assertEquals(4, result);
    }

    @Test
    @DisplayName("Should throw exception when one of values is negative")
    void testProd2ShouldThrowExceptionWhenOneOfValuesIsNegative() {
        Throwable exception = assertThrows(RuntimeException.class, () -> producto.prod2(-1, 2));
        assertEquals("EL NUMERO ES NEGATIVO, NO FUNCIONA LA CALCULADORA", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw exception when one of values is zero")
    void testProd2ShouldThrowExceptionWhenOneOfValuesIsZero() {
        Throwable exception = assertThrows(RuntimeException.class, () -> producto.prod2(0, 2));
        assertEquals("POR CERO NO SE PUEDE MULTIPLICAR", exception.getMessage());
    }

    @Test
    @DisplayName("Should return result when positive numbers are passed")
    void testProd2ShouldReturnResultWhenPositiveNumbersArePassed() {
        double result = producto.prod2(2, 2);
        assertEquals(4, result);
    }

    @Test
    @DisplayName("Should throw exception when one of values is negative")
    void testProd3NegaShouldThrowExceptionWhenOneOfValuesIsNegative() {
        Throwable exception = assertThrows(RuntimeException.class, () -> producto.prod3Nega(-1, 2, 7));
        assertEquals("EL NUMERO ES NEGATIVO, NO FUNCIONA LA CALCULADORA", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw exception when one of values is zero")
    void testProd3NegaShouldThrowExceptionWhenOneOfValuesIsZero() {
        Throwable exception = assertThrows(RuntimeException.class, () -> producto.prod3Nega(0, 2, 7));
        assertEquals("POR CERO NO SE PUEDE MULTIPLICAR", exception.getMessage());
    }

    @Test
    @DisplayName("Should return result when positive numbers are passed")
    void testProd3NegaShouldReturnResultWhenPositiveNumbersArePassed() {
        double result = producto.prod3Nega(2, 2, 3);
        assertEquals(12, result);
    }

    @Test
    @DisplayName("Should throw exception when one of values is negative")
    void testPot1ShouldThrowExceptionWhenOneOfValuesIsNegative() {
        Throwable exception = assertThrows(RuntimeException.class, () -> producto.pot1(-1, 2));
        assertEquals("EL NUMERO ES NEGATIVO, NO FUNCIONA LA CALCULADORA", exception.getMessage());
    }

    @Test
    @DisplayName("Should throw exception when one of values is zero")
    void testPot1ShouldThrowExceptionWhenOneOfValuesIsZero() {
        Throwable exception = assertThrows(RuntimeException.class, () -> producto.pot1(0, 2));
        assertEquals("POR CERO NO SE PUEDE MULTIPLICAR", exception.getMessage());
    }

    @Test
    @DisplayName("Should return result when positive numbers are passed")
    void testPot1ShouldReturnResultWhenPositiveNumbersArePassed() {
        double result = producto.pot1(2, 3);
        assertEquals(8, result);
    }
}