package ejerfor;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
//Pido que declase la variable n
		
		Scanner sc3 = new Scanner(System.in);
			System.out.println("Introduce un numero entero positivo");
			int n = sc3.nextInt();

//El programa revisa si n es entero positivo
		
		int factorial = 1;
		if(n >= 1){
			System.out.println(n + " Es un numero entero positivo");
			for(int i = 1; i <= n; ++i){
				factorial = i * factorial;
				System.out.println(i + " Es el factorial de " + factorial);
			}
		}
		sc3.close();
	}

}
