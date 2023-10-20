package EjerciciosSwitch;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca la cantidad de dinero que tiene");
				int dinero = sc.nextInt();
			
		Scanner sc2 = new Scanner(System.in);
			System.out.println("Introduzca que moneda esta usando, euros (€) o dolares ($)");
				char moneda = sc2.next().charAt(0);
		
		switch(moneda){
			case '€':
				System.out.println("Tienes " + dinero + moneda);
				System.out.println("¿Desea cambiar su dinero de Euros a Dolares?");
			break;
			case '$':
				System.out.println("Tienes " + dinero + moneda);
				System.out.println("¿Desea cambiar su dinero de Dolares a Euros?");
			break;
			default:
				System.out.println("La moneda que utiliza no se encuentra en el sistema");
		}
		Scanner sc3 = new Scanner(System.in);
			System.out.println("Presione y si desea cambiar la moneda, si no lo desea presione n");
				char respuesta = sc2.next().charAt(0);
		
		switch(respuesta) {
			case 'y' :
				System.out.println("Ya le cambiaremos su dinero con el tiempo");
				break;
			case 'n':
				System.out.println("Que le jodan");
				break;
			default:
				System.out.println("Usted es tonto");
		}
		
		
		sc.close();
		sc2.close();
	}

}
