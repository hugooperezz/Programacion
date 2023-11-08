package EjerciciosCondicionesLogicas;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cuantos lados iguales tiene su triangulo");
			int lados = sc.nextInt();
		
		if ( lados ==  3 ) {
			System.out.println("Su triangulo es equilatero por que tiene " + lados + " lados iguales");
		} else if ( lados == 2 ) {
			System.out.println("Su triangulo es isosteles por que tiene " + lados + " lados iguales");
		} else if ( lados == 0 ) {
			System.out.println("Su triangulo es escaleno por que tiene " + lados + " lados iguales");
		}
		
		sc.close();
		
	}

}
