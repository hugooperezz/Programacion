package EjerciciosDoWhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
			int n = sc.nextInt();
		
		int suma = 0;
		int i = 1;
		do {
			if(i % 2 == 0) {
				suma += i;
				System.out.println("Los numeros pares son " + i);
			}
			i++;
		}while(n >= i);
		
		System.out.println("La suma total de todos los pares de uno hasta " + n + " " + suma);

	}

}
