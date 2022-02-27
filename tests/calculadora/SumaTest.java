package calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumaTest {
    Suma suma;

    @BeforeEach
    void setUp() {
        suma = new Suma();
    }

    @Test
    public void Suma() {
        int total = suma.suma_enteros(2,2);
        assertEquals(4, total);
    }
    @Test
    public void SumaNegativa(){
        int total = suma.suma_enteros(-5,15);
        assertEquals(10, total);
    }
    @Test
    public void SumaAcumulada(){
        double Acumulado = suma.valor_acumulado(5);
        assertEquals(5, Acumulado);
        double Acumulado1 = suma.valor_acumulado(2);
        assertEquals(7, Acumulado1);
    }
    @Test
    public void SumaReales(){
        double Reales = suma.suma_reales(2.5,2.5);
        assertEquals(5, Reales);
    }
   }


