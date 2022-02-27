package calculadora;


/**
 * @author Irene Perez
 * @version 1.0
 */

public class Resta {
    /**
     * El acumulado de las operaciones.
     */
    public static double acumulado;

    public Resta() {
    }

    /**
     * @param numA Primer número real para restar
     * @param numB Segundo número real para restar
     * @return devuelve el resultado de la resta de numA y numB en forma de double
     * @throws RuntimeException cuando algun numero es negativo
     */
    public double numerosReales(double numA, double numB) {
        if (numA < 0 || numB < 0) {
            throw new RuntimeException("No soportamos la resta de numeros negativos");
        }
        return numA - numB;
    }

    /**
     * @param numA Primer número entero para restar
     * @param numB Segundo número entero para restar
     * @return devuelve el resultado de la resta de numA y numB en forma de int
     * @throws RuntimeException cuando algun numero es negativo
     */
    public int numerosEnteros(int numA, int numB) {
        if (numA < 0 || numB < 0) {
            throw new RuntimeException("No soportamos la resta de numeros negativos");
        }
        return numA - numB;
    }

    /**
     * @param numA Primer número real para restar
     * @param numB Segundo número real para restar
     * @param numC Tercer número real para restar
     * @return devuelve el resultado de la resta de numA, numB y numC en forma de double
     * @throws RuntimeException cuando algun numero es negativo
     */
    public double numerosReales(double numA, double numB, double numC) {
        if (numA < 0 || numB < 0 || numC < 0) {
            throw new RuntimeException("No soportamos la resta de numeros negativos");
        }
        return numA - numB - numC;
    }

    /**
     * {@link Resta#acumulado}
     *
     * @param numero el número que se va a restar al acumulado
     * @return devuelve el resultado en forma de double
     * @throws RuntimeException cuando el numero es negativoç
     */
    public double sobreAcumulado(double numero) {
        if (numero < 0) {
            throw new RuntimeException("No soportamos la resta de numeros negativos");
        }
        return acumulado - numero;
    }
}
