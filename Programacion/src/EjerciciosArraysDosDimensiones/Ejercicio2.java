package EjerciciosArraysDosDimensiones;

public class Ejercicio2 {
	
/**
* Este es mi metodo main
* @param args
*/
	public static void main(String[] args) {
		
		//Creo los Arrays
		
		int[][] matriz = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	    };	
		
		int filas = matriz.length;
	    int columnas = matriz.length;
	    
	    
	    System.out.print("Matriz original:");
	    for (int i = 0; i < filas; i++) {
	    	System.out.print("\n");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
	    }
	    
	    System.out.println("\n");
	    
	    
	    System.out.print("Matriz nueva:");
	    for (int i = 0; i < filas; i++) {
	    	System.out.print("\n");
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[j][i] + " ");
            }
	    }

	}

}
