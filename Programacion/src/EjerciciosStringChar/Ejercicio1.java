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
		
		System.out.println("Introduce una frase y te diremos cuantos caractéres tiene:");
        
		Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();//El nextLine sirve para que el programa reconozca la frase entera

        n = n.toLowerCase();

        String[] i = n.split("a", -1);
        int k = i.length -1;

        System.out.println(k);
        
        sc.close();
	}

}
