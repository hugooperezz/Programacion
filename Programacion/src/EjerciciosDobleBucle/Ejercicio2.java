package EjerciciosDobleBucle;

import java.util.Scanner;

/**
 * Triangulo con numeros
 */

public class Ejercicio2 {

/**
 * Entrada de mi programa
 * @param args
 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
			int n = sc.nextInt();
			
		for( int i = 0; i <= n; ++i ) {
			int numero = 1;
			for( int j = 1; j <= i; ++j ) {
				System.out.print( numero );
				++numero;
			}
			System.out.println(" ");
		}
		sc.close();

	}

}
