package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca la cantidad de dinero que tiene");
				int dinero = sc.nextInt();
			
		Scanner sc2 = new Scanner(System.in);
			System.out.println("Introduzca que moneda esta usando, euros (E) o dolares (D)");
				char moneda = sc2.next().charAt(0);
		
		switch(moneda){
			case 'E':
				System.out.println("¿Desea cambiar su dinero de Euros a Dolares?");
			break;
			case 'D':
				System.out.println("¿Desea cambiar su dinero de Dolares a Euros?");
			break;
			default:
				System.out.println("La moneda que utiliza no se encuentra en el sistema");
		}
		sc.close();
		sc2.close();
	}

}
