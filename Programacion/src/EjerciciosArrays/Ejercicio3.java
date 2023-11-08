package EjerciciosArrays;

import java.util.Random;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		//Creo la variable del tamaño del Array
		
		int tamaño = 10;
		int[] numerosramdom = new int [tamaño];
		
		 // Genera números enteros aleatorios y llena el array
		
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            numerosramdom[i] = random.nextInt(20);
        }
        
        // Imprimo los numeros del array
        
        System.out.print("Numeros del array:");
        for ( int numeros : numerosramdom ){ // El : en un bucle for sirve para la iteracion con los arrays
        	System.out.print(numeros + " ");
        }
		
        // Encuentra el número más grande en el array
        
        int numeroMasGrande = numerosramdom[0];
        
        for ( int i = 1; i < tamaño; i++ ) {
            if ( numerosramdom[i] > numeroMasGrande ) {
                numeroMasGrande = numerosramdom[i];
            }
        }
        
        System.out.println("\n" + "El numero mas grande es: " + numeroMasGrande);
        
	}

}
