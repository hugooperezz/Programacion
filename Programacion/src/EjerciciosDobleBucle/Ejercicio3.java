package EjerciciosDobleBucle;

import java.util.Scanner;

/**
 * Tabla de numeros
 */

public class Ejercicio3 {

/**
 * Entrada del programa
 * @param args
 */
	
	public static void main(String[] args) {
		
		int n = 1;
		
		for ( int i = 1; i <= 10; ++i ) {
			System.out.print(i);
			for ( int f = 1; f <= 10; ++f ) {
				n = i * f;
				System.out.print(" " + n);
			}
			System.out.println(" ");
		}

	}

}
