package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Pulse 1 si quiere entrar Perfil.");
			System.out.println("Pulse 2 si quiere entrar a Inicio");
			System.out.println("Pulse 3 si quiere entrar a Carrito");
				int menu = sc.nextInt();
				
		switch(menu) {
			case 1:
				System.out.println("Esta dentro de Perfil");
				break;
			case 2:
				System.out.println("Esta dentro de Inicio");
				break;
			case 3:
				System.out.println("Esta dentro de Carrito");
			default:
				System.out.println("Ese numero no coincide con el menu");
		}

	}

}
