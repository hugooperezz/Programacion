package PruebaArrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array[] = new int[5];
		
		//Relleno el array
		
		System.out.println("Introduzca los numeros del Array");
		for ( int posicion = 0; posicion < array.length; posicion++ ){
			int n = sc.nextInt();
			array[posicion] = n;	
		}
		
		//Imprimo los arrays
		
		System.out.println("Este es el array");
		for ( int posicion = 0; posicion < array.length; posicion++ ) {
			System.out.println(array[posicion]);
		}
		sc.close();
	}

}
