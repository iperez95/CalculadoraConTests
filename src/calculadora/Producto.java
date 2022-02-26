package calculadora;

public class Producto {

	/**
	 * JAVADOC PARA LA CREACION DE UNA CALCULADORA.  <b>"CLASE PRODUCTO"<b> 
	 * 
	 * TENDRA TRES MÉTODOS QUE REALIZARAN MULTIPLICACIONES Y UN MÉTODO QUE REALIZARA UNA POTENCIA 
	 * 
	 * @author ADRIAN ALVAREZ PEREZ.
	 * @version 1.0
	 * @since 27/01/2022
	 * 
	 */
		

		/**
		 * CONSTRUCTOR VACIO
		 */
		public Producto() {
		}
		
		
		/**
		* MÉTODO QUE SI LE PASAS POR PARAMETROS UN <b>NUMERO NEGATIVO<b>, Lanza una excepcion Y TE DICE QUE ES NEGATIVO EL NUMERO.
		* SI LE PASAS POR PÁRAMETROS UN <b>CERO"<b>, lanza una excepcion Y TE DICE QUE POR CERO NO SE PUEDE MULTIPLICAR.
		* SI EL NUMERO ES POSITIVO Y MAYOR DE CERO, EL MÉTODO MULTIPLICA LOS DOS NÚMEROS REALES PASADOS POR PÁRAMETROS.
		*
		* @param num1
		* VALOR NÚMERICO REAL.  
		* 
		* @param num2
		* VALOR NÚMERICO REAL.
		*
		 * @throws RuntimeException cuando uno de los dos numeros es negativo o cuando son 0
		*/
		public double prod1(double num1, double num2) {
			if(num1 < 0 || num2 < 0) {
				throw new RuntimeException("EL NUMERO ES NEGATIVO, NO FUNCIONA LA CALCULADORA");
			} else if(num1 == 0 || num2 == 0) {
				throw new RuntimeException("POR CERO NO SE PUEDE MULTIPLICAR");
			} else {
				return num1 * num2;
			}
		}
		
		
		/**
		 * MÉTODO QUE SI LE PASAS POR PARAMETROS UN <b>NUMERO NEGATIVO<b>, DEVUELVE UNA CADENA Y TE DICE QUE ES NEGATIVO EL NUMERO.
		 * SI LE PASAS POR PÁRAMETROS UN <b>CERO"<b>, DEVUELVE UNA CADENA Y TE DICE QUE POR CERO NO SE PUEDE MULTIPLICAR.
		 * SI EL NUMERO ES <b>POSITIVO Y MAYOR DE CERO<b>, EL MÉTODO MULTIPLICA LOS DOS NÚMEROS ENTEROS PASADOS POR PÁRAMETROS.
		 * 
		 * @param num1
		 * VALOR NÚMERICO ENTERO.  SI SE INTRODUCE UN 0 EN LOS PARAMETROS DEVUELVE UN 0 COMO RESULTADO.
		 * 
		 * @param num2
		 * VALOR NÚMERICO ENTERO.
		 * 
		 */
		public int prod2(int num1, int num2) {
			if(num1 < 0 || num2 < 0) {
				throw new RuntimeException("EL NUMERO ES NEGATIVO, NO FUNCIONA LA CALCULADORA");
			} else if(num1 == 0 || num2 == 0) {
				throw new RuntimeException("POR CERO NO SE PUEDE MULTIPLICAR");
			} else {
				return num1 * num2;
			}
		}
		
		
		/**
		 * MÉTODO QUE SI LE PASAS POR PARAMETROS UN <b>NUMERO NEGATIVO<b>, DEVUELVE UNA CADENA Y TE DICE QUE ES NEGATIVO EL NUMERO.
		 * SI LE PASAS POR PÁRAMETROS UN <b>CERO"<b>, DEVUELVE UNA CADENA Y TE DICE QUE POR CERO NO SE PUEDE MULTIPLICAR.
		 * SI EL NUMERO ES <b>POSITIVO Y MAYOR DE CERO<b>, EL MÉTODO MULTIPLICA LOS TRES NÚMEROS REALES PASADOS POR PÁRAMETROS.
		 * 
		 * @param num1
		 * VALOR NÚMERICO REAL.  
		 * 
		 * @param num2
		 * VALOR NÚMERICO REAL.
		 * 
		 * @param num3
		 * VALOR NÚMERICO REAL.
		 *
		 */
		public double prod3Nega(double num1, double num2, double num3) {
			if(num1 < 0 || num2 < 0 || num3 < 0) {
				throw new RuntimeException("EL NUMERO ES NEGATIVO, NO FUNCIONA LA CALCULADORA");
			} else if(num1 == 0 || num2 == 0) {
				throw new RuntimeException("POR CERO NO SE PUEDE MULTIPLICAR");
			} else {
				return num1 * num2 * num3;
			}
		}
		
		
		/**
		 * MÉTODO QUE SI LE PASAS POR PARAMETROS UN <b>NUMERO NEGATIVO<b>, DEVUELVE UNA CADENA Y TE DICE QUE ES NEGATIVO EL NUMERO.
		 * SI LE PASAS POR PÁRAMETROS UN <b>CERO"<b>, DEVUELVE UNA CADENA Y TE DICE QUE POR CERO NO SE PUEDE HACER LA POTENCIA.
		 * SI EL NUMERO ES <b>POSITIVO Y MAYOR DE CERO<b>, EL METODO REALIZA LA BASE Y EL EXPONENTE DE LA POTENCIA DE LOS DOS NÚMEROS ENTEROS PASADOS POR PÁRAMETROS
		 * 
		 * @param base
		 * VALOR NÚMERICO ENTERO. 
		 * 						  
		 * @param exp
		 * VALOR NÚMERICO ENTERO.
		
		 * 
		 * @throws Exception SI PONES MUCHOS NÚMEROS, MAS DE LOS ADMITIDOS POR UN ENTERO, DA ERROR.
		 *
		 */
		public int pot1(int base, int exp) {
			if(base < 0 || exp < 0) {
				throw new RuntimeException("EL NUMERO ES NEGATIVO, NO FUNCIONA LA CALCULADORA");
			} else if(base == 0 || exp == 0) {
				throw new RuntimeException("POR CERO NO SE PUEDE MULTIPLICAR");
			} else {
				return (int)(Math.pow(base,exp));
			}
		}
}
