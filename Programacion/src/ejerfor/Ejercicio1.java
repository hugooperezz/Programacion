package ejerfor;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n2 = sc.nextInt();
		
		for(int n = 1; n <= n2; n++) {
			System.out.println("I tiene un valor " + n);
		}
		sc.close();
	}

}
