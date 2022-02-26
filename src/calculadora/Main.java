package calculadora;

public class Main {

    public static void main(String[] args) {
        Producto p1= new Producto();
        p1.prod1(5, 1);
        p1.prod2(-2, -5);
        p1.prod3Nega(5, 9, 0);
        p1.pot1(2, 4445);

        Suma s1= new Suma();
        System.out.println(s1.suma_enteros(5,4));
        System.out.println(s1.suma_reales(3.4,4.2));
        System.out.println(s1.suma_3reales(4.5,2.4,5.7));
        System.out.println(s1.valor_acumulado(3));
    }
}
