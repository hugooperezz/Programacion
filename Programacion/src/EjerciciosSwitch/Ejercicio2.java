package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca un numero");
				int n = sc.nextInt();
				
		Scanner sc2 = new Scanner(System.in);
			System.out.println("Introduce uno de estos caracteres + - * /");
				char caracter = sc2.next().charAt(0);
		
		Scanner sc3 = new Scanner(System.in);
			System.out.println("Introduce un segundo numero");
				int n2 = sc3.nextInt();
		
		int res;
		switch(caracter){
			case '+':
				res = n + n2;
				System.out.println("El reultado es " + res);
				break;
			case '-':
				res = n - n2;
				System.out.println("El resultado es " + res);
				break;
			case '*':
				res = n * n2;
				System.out.println("El resultado es " + res);
				break;
			case '/':
				if (n2 != 0) {
					res = n / n2;
					System.out.println("El resultado es " + res);
				}else {
					System.out.println("Como haga esta operacion voy a morir a si que si me quieres no lo hagas :)");
				}
				break;
			default:
				System.out.println("No existe ningun caracter como " + caracter);
			}
		
		sc.close();
		sc2.close();
		sc3.close();
		
	}
}
