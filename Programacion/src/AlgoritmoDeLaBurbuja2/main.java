package AlgoritmoDeLaBurbuja2;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		int[] array = new int []{30,80,20,10,40,50};
		int n = array.length;
		
		//Array impreso desordenado
		
		System.out.println("Array desordenado");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println(" ");
		
		//Ordenar el array
		
		int numeros;
		
		for (int i = 0 ; i < n; i++) {
			for (int j = 0 ; j < n - i - 1; j++) {
				if (array [j] > array [(j + 1)]) {
					numeros = array [j];
					array [j] = array [j + 1];
					array [j+1] = numeros;
				}
			}
		}
		
		//Imprimir array ordenado
		
		System.out.println("Array ordenado");
		for (int i = 0 ; i < n; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
