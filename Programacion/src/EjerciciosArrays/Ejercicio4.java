package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		// PARA GENERAR ARRAYS RANDOMS
		
		/*Random r1 = new Random();
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
		    array[i] = r1.nextInt(1, 100);
		}*/
		int[] array = new int[] {70, 3, 21, 9, 2};
      
       Scanner scn = new Scanner (System.in);
       System.out.println("Introduce un número a ver si esta en la array :)");
       int num1 = scn.nextInt();
       int posicion = -1;
      
       for (int i = 0; i < array.length; i++) {
       	if (array[i] == num1) {
       		posicion = i;
       		System.out.println("El valor " + num1 + " esta en el array, y este se encuentra en la poscion " + posicion);
       	}	
       }
      
       if (posicion < 0) {
       	System.out.println("El valor no ha sido encontrado");
       }
		
	}
}

