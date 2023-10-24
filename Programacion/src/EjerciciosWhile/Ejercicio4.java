package EjerciciosWhile;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int random = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		System.out.println("Se ha generado un numero aleatorio del 0 al 100");
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca el numero que usted cree que se ha generado");
			int n = sc.nextInt();
		
		while(n!= random) {
			n = sc.nextInt();
			if(n < random){
				System.out.println("El numero es mas alto");
			}else if (n > random){
				System.out.println("El numero es mas bajo");
			}else if (n == random){
				System.out.println("Muy bien has acertado");
			}
		}
	
	}

}
