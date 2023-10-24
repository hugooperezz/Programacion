package EjerciciosDobleBucle;

import java.util.Scanner;

/**
 * Triangulo con doble bucle
 */

public class Ejercicio1 {

/**
 * Entrada de programa
 * @param args
 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero");
			int n = sc.nextInt();
			
		for(int i = 0; i <= n; ++i) {
			for(int j = 1; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	sc.close();
	}

}
