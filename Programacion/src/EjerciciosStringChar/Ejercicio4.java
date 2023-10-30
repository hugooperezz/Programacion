package EjerciciosStringChar;

import java.util.Scanner;

/**
 * Esta es la unica clase de mi programa
 */

public class Ejercicio4 {

/**
* Este es el metodo para poder invertir
* @param args
*/
	
	public static String invertir (String cadena) {

        return new StringBuilder(cadena).reverse().toString();

    }
	
/**
* Este es la entrada de mi codigo
* @param args
*/
	
	public static void main(String[] args) {
		
		 Scanner sc1 = new Scanner(System.in);
	        System.out.println();
	        String n = sc1.nextLine();
	        String invert = invertir(n); //Es un metodo creado anteriormente que te invierte la frase

	        System.out.println(invert);
	        
	     sc1.close();

	}

}
