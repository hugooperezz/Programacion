package EjerciciosCondicionesLogicas;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("Introduzca 3 numeros");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int n3 = sc.nextInt();
			
		if ( n1 > n2 && n2 > n3 ) {
			System.out.println("Los numeros estan en orden decreciente");
		} else if ( n1 < n2 && n2 < n3 ) {
			System.out.println("Los numeros estan en orden creciente");
		} else {
			System.out.println("Los numeros no estan ni en orden creciente ni decreciente");
		}
	}

}
