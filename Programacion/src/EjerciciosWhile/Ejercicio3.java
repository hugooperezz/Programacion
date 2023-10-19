package EjerciciosWhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca un numero");
			int n = sc.nextInt();
			
		int digitos = 0;
		while(n > 0){
			n = n/10;
			digitos++;
		}
		System.out.println("El numero introducido tiene " + digitos + " digitos");
		sc.close();
	}
	
}
