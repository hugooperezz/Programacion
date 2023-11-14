package EjerciciosArrays;

import java.util.Random;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int tamaño = 10;
		int[] numerosramdom = new int [tamaño];
		
      Random aleatorio = new Random();
      for (int i = 0; i < tamaño; i++) {
          numerosramdom[i] = aleatorio.nextInt(20);
      }
  
      System.out.println("Array original:");
      for (int numeros : numerosramdom){
      	System.out.print(numeros + " ");
      }
		
      System.out.println("\n" + "Introduce la posicion del elemento del 0-9");
      Scanner sc1 = new Scanner(System.in);
      int n1 = sc1.nextInt();
     
      System.out.println("Introduce el elemento que quieres añadir");
      Scanner sc2 = new Scanner(System.in);
      int n2 = sc2.nextInt();
      if (n1 >= 0 && n1 < tamaño) {/*Quiere decir que la posicion que pongamos tiene que ser mayor o igual que 0 y menor que "tamaño"*/
          for (int i = tamaño - 1; i > n1; i--) {/*Es un bucle que se engarda de desplazar los elementos a la derecha empezando por el ultimo, esto crea un espacio */
              numerosramdom[i] = numerosramdom[i - 1];
          }
          numerosramdom[n1] = n2;/*poner el nuevo elemento "n2" en la posicion definida en "n1"*/
          System.out.println("Nuevo Array:");
          for (int i = 0; i < tamaño; i++) {/*Array actualizado*/
              System.out.print(numerosramdom[i] + " ");
          }
      } else {
          System.out.println("Posición fuera de rango. No se ha realizado la inserción.");
      }	
	}
}

