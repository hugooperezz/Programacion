package ejerfor;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc5 = new Scanner(System.in);
			System.out.println("Introduzca un numero");
			int n = sc5.nextInt();
		
		for(int i = n; i >= 1; i--) {
			System.out.println("N tiene un valor " + i);
		}
		sc5.close();

	}

}
