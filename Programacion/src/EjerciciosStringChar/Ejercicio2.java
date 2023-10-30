package EjerciciosStringChar;

import java.util.Scanner;

/**
 * Esta es la unica clase de mi programa
 */

public class Ejercicio2 {

/**
 * Este es el punto de entrada de mi programa
 * @param args
 */
	
	public static void main(String[] args) {


		System.out.println("Introduce una frase que contenga la letra e");
        
		Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        
        char original = 'e';
        char cambio = 'x';
        
        String frasenueba = frase.replace(original, cambio); //Metodo para cambiar las letras por las que le indico
        
        System.out.println( frasenueba );
        
        sc.close();
	}

}
