package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca un numero");
			int n = sc.nextInt();
			
		int i = 0;
		while(i <= n) {
			System.out.println("I vale " + i);
			i++;
		}
		sc.close();
	}

}
