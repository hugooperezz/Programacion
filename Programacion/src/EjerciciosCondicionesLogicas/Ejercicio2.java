package EjerciciosCondicionesLogicas;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("Introduzca 3 numeros");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			
		if ( n1 > n2 && n1 > n3 ) {
			System.out.println(n1 + " Es el mas grande");
		} else if ( n2 > n1 && n2 > n3 ) {
			System.out.println(n2 + " Es el mas grande");
		} else if ( n3 > n1 && n3 > n2 ) {
			System.out.println(n3 + " Es el mas grande");
		}
		if ( n1 < n2 && n1 < n3 ) {
			System.out.println(n1 + " Es el mas pequeño");
		} else if ( n2 < n1 && n2 < n3 ) {
			System.out.println(n2 + " Es el mas pequeño");
		} else if ( n3 < n1 && n3 < n2 ) {
			System.out.println(n3 + " Es el mas pequeño");
		}
		
		sc.close();
		sc2.close();
		sc3.close();
		
	}

}
