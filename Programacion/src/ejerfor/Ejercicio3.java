package ejerfor;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

//Pido que declase la variable n
		
		Scanner sc3 = new Scanner(System.in);
			System.out.println("Introduce un numero");
			int n = sc3.nextInt();

//Bucle de multiplicacion
		
		for(int i = 1; i <= 10 ; i++){
			System.out.println(n * i);
		}
		sc3.close();
	}

}
