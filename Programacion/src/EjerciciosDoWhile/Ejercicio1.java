package EjerciciosDoWhile;

import java.util.Scanner;

/**
 * Ejercicio DoWhile
 * @author Hugo
 */

public class Ejercicio1 {
/**
 * Esta clase 
 * @param args
 */
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
