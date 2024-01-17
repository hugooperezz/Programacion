package EjerciciosEnum;

import java.util.Scanner;

public class Ejercicio1 {

	public enum Dias {
		
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINDO
		
	}
	
	public static void main(String[] args) {
		
		Dias hoy = Dias.LUNES;
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el numero de dia de la semana");
			int numero_dia = sc.nextInt();
			
		switch ( numero_dia ) {
			case (1):
				hoy = Dias.LUNES;
				System.out.println("Hoy es " + hoy);
			break;
			case (2):
				hoy = Dias.MARTES;
				System.out.println("Hoy es " + hoy);
			break;
			case (3):
				hoy = Dias.MIERCOLES;
				System.out.println("Hoy es " + hoy);
			break;
			case (4):
				hoy = Dias.JUEVES;
				System.out.println("Hoy es " + hoy);
			break;
			case (5):
				hoy = Dias.VIERNES;
				System.out.println("Hoy es " + hoy);
			break;
			case (6):
				hoy = Dias.SABADO;
				System.out.println("Hoy es " + hoy);
			break;
			case (7):
				hoy = Dias.DOMINDO;
				System.out.println("Hoy es " + hoy);
			break;
			default:
				System.out.println("Ese dia no existe en la semana");
		}
		
		sc.close();

	}

}
