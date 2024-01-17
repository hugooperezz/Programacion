package EjerciciosStringChar;

import java.util.Scanner;

/**
 * Esta es la unica clase de mi programa
 */

public class Ejercicio1 {

/**
 * Entrada de mi programa
 * @param args
 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase y te diremos cuantos caractéres tiene:");
        String frase = sc.nextLine();//El nextLine sirve para que el programa reconozca la frase entera
        
        //Reconozco cuantas vezes aparece una letra
        
        int contador = 0;
         for (int i = 0 ; i < frase.length(); i++) {
        	 if ( frase.charAt(i) == 'a' || frase.charAt(i) == 'A' ) {
        		 contador++;
        	 }
         }
        
         //Imprimo
         
         System.out.println("El numero de a que hay en la frase " + frase + " es " + contador);
         sc.close();
	}

}
