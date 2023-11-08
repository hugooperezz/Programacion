package EjerciciosArrays;

import java.util.Arrays;

import java.util.HashSet;

public class Ejercicio7 {

	public static void main(String[] args) {
		
// Crear el Arrays
		
		int[] numeros = {3, 4, 1, 5, 2, 3, 8 , 8, 7 , 10};
		
// Ordenar el Arrays
		
        Arrays.sort(numeros);
        
//Imprimo el arrays con los numeros repetidos
        
        System.out.print("Este es el array con numeros repetidos: ");
        for ( int numero : numeros ) {
        	System.out.print(numero + " ");
        }
        
/*Convertir el Arrays en un conjunto para eliminar los duplicados
de esta forma cuando se convierta en arrays otra vez no tendra ningun duplicado*/
        
        HashSet<Integer> conjunto = new HashSet<>();
        for ( int numero : numeros ) {
            conjunto.add(numero);
        }
        
// Tranformar el conjunto de vuelta en un arrays
        
        Integer[] arraysinrepes = conjunto.toArray(new Integer[conjunto.size()]);
        
// Imprimir el array sin números repetidos
        
        System.out.print("\n" + "Este es el array con numeros sin repetir: ");
        for ( int numero : arraysinrepes ) {
            System.out.print(numero + " ");
        }

	}

}
