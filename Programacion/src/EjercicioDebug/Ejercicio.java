package EjercicioDebug;

/**
 * Contador de numeros primos
 * @author Hugo
 */

public class Ejercicio {

/**
 * Entrada de programa
 * @param args
 */
	
	public static void main(String[] args) {
		
		int contadorprimos = 0;
		int i = 1;
		int posicion = 1;
		
		while ( i <= 1000 ) {
			if ( i % 2 == 0 && i % 3 == 0) {
				contadorprimos++;
				System.out.println("El " + contadorprimos + "º es " + i );
			}
			//System.out.println( "I vale " + i );
			i++;
		}
		System.out.println( "El numero de primos que hay son " + contadorprimos );
	}

}
