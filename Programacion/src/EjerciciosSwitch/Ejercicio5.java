package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca su calificacion del 1 al 10");
				int nota = sc.nextInt();
				
		switch (nota) {
			case 1:
				System.out.println("Suspenso");
			break;
			case 2:
				System.out.println("Suspenso");
			break;
			case 3:
				System.out.println("Suspenso");
			break;
			case 4:
				System.out.println("Suspenso");
			break;
			case 5:
				System.out.println("Bien");
			break;
			case 6:
				System.out.println("Bien alto");
			break;
			case 7:
				System.out.println("Notable");
			break;
			case 8:
				System.out.println("Notable alto");
			break;
			case 9:
				System.out.println("Sobresaliente");
			break;
			case 10:
				System.out.println("Matricula de honor");
			break;
			default:
				System.out.println("No es posible sacar esa nota");
		}

	}

}
