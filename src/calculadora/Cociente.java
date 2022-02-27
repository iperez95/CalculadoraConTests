package calculadora;

/**
 * @author Diego Fernandez
 * @version 1.0
 */
public class Cociente {
    /**
     * @param numA Primer número real para dividir
     * @param numB Segundo número real para dividir
     * @return devuelve el resultado de la dividir de numA y numB en forma de double
     * @throws RuntimeException cuando algun numero es negativo
     */
    public double numerosReales(double numA, double numB) {
        if (numA < 0 || numB < 0) {
            throw new RuntimeException("No soportamos la division de numeros negativos");
        }
        return numA / numB;
    }

    /**
     * @param numA Primer número entero para dividir
     * @param numB Segundo número entero para dividir
     * @return devuelve el resultado de la division de numA y numB en forma de double,
     * si no da un numero exacto, devolvemos los decimales
     * @throws RuntimeException cuando algun numero es negativo
     */
    public double numerosEnteros(int numA, int numB) {
        if (numA < 0 || numB < 0) {
            throw new RuntimeException("No soportamos la division de numeros negativos");
        }
        return (double) numA / numB;
    }

    /**
     * @param numero Numero a invertir
     * @return devuelve el resultado de la division de numB entre numA en forma de double
     * @throws RuntimeException cuando algun numero es negativo
     */
    public double inversoNumeroReal(double numero) {
        if (numero < 0) {
            throw new RuntimeException("No soportamos la division de numeros negativos");
        }
        return numero;
    }

    /**
     * @param numero el número sobre el que calcular la raiz
     * @return devuelve el resultado en forma de double
     * @throws RuntimeException cuando el numero es negativo
     */
    public double raiz(double numero) {
        if (numero < 0) {
            throw new RuntimeException("No soportamos la division de numeros negativos");
        }
        return numero;
    }
}
