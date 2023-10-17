package ejerfor;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
//Pedir un numero N
		
		Scanner sc2 = new Scanner(System.in);
			System.out.println("Introduce un numero");
			int n = sc2.nextInt();
		
//Grabo los numeros del 1 al N
		
		int suma = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				suma += i;
				System.out.println("Suma " + suma);
			}
		}
	}
}

