package EjerciciosEnum;

import java.util.Scanner;

public class Ejercicio2 {

	public enum TiposVehiculos {
			
			COCHE, MOTO, CAMION, BICICLETA
			
	}
	
	public static void main(String[] args) {
		
		TiposVehiculos vehiculo = TiposVehiculos.COCHE; 
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce que veiculo tienes");
			
			System.out.println("Coche 1");
			System.out.println("Moto 2");
			System.out.println("Camion 3");
			System.out.println("Bicicleta 4");
			int n = sc.nextInt();
			
			switch ( n ) {
			case (1):
				vehiculo = TiposVehiculos.COCHE;
				System.out.println("Su vehiculo es un " + vehiculo);
			break;
			case (2):
				vehiculo = TiposVehiculos.MOTO;
				System.out.println("Su vehiculo es una " + vehiculo);
			break;
			case (3):
				vehiculo = TiposVehiculos.CAMION;
				System.out.println("Su vehiculo es un " + vehiculo);
			break;
			case (4):
				vehiculo = TiposVehiculos.BICICLETA;
				System.out.println("Su vehiculo es una " + vehiculo);
			break;
			default:
				System.out.println("Ese vehiculo no esta en el sistema");
			}
			
			sc.close();

	}

}
