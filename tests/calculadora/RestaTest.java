package calculadora;


	import org.junit.jupiter.api.BeforeEach;
	import org.junit.jupiter.api.DisplayName;
	import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.*;
	
	

	public class RestaTest {
	    Resta resta;


	    @BeforeEach
	    void setUp() {
	        resta = new Resta();
	    }

	    @Test
	    @DisplayName("numerosReales throw exception when one of values is negative")
	    void testnumerosRealesShouldThrowExceptionWhenOneOfValuesIsNegative() {
	        Throwable exception = assertThrows(RuntimeException.class, () -> resta.numerosReales(-1, 2));
	        assertEquals("No soportamos la resta de numeros negativos", exception.getMessage());
	    }

	    @Test
	    @DisplayName("numerosEeales throw exception when one of values is negative")
	    void testnumerosEnterosShouldThrowExceptionWhenOneOfValuesIsNegative() {
	        Throwable exception = assertThrows(RuntimeException.class, () -> resta.numerosEnteros(-1, 2));
	        assertEquals("No soportamos la resta de numeros negativos", exception.getMessage());
	    }

	    @Test
	    @DisplayName("numerosReales3 throw exception when one of values is negative")
	    void testnumerosReales3valuesShouldThrowExceptionWhenOneOfValuesIsNegative() {
	        Throwable exception = assertThrows(RuntimeException.class, () -> resta.numerosReales(-1, 2,4));
	        assertEquals("No soportamos la resta de numeros negativos", exception.getMessage());
	    }
	    @Test
	    @DisplayName("sobreAcumulado throw exception when one of values is negative")
	    void testsobreAcumuladoShouldThrowExceptionWhenOneOfValuesIsNegative() {
	        Throwable exception = assertThrows(RuntimeException.class, () -> resta.sobreAcumulado(-5));
	        assertEquals("No soportamos la resta de numeros negativos", exception.getMessage());
	    }
}
