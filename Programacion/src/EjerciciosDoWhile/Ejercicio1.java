package EjerciciosDoWhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
			int n = sc.nextInt();
		
		int i = 1;
		do{
			System.out.println(n*i);
			i++;
		}while(i <= 10);

	}

}
