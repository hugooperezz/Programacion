package EjerciciosArraysDosDimensiones;

public class Ejercicio1 {

/**
 * Este es un metodo para imprimir la matriz
 * @param
 */
	
	public static void mostrarMatriz(int[][] matriz) {
		
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

/**
 * Este es mi metodo main
 * @param args
 */
	
	public static void main(String[] args) {
		
		//Creo los Arrays
		
		int[][] matriz1 = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	    };

	    int[][] matriz2 = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	    };

	    int filas = matriz1.length;
	    int columnas = matriz1.length;

	    int[][] resultado = new int[filas][columnas];

	    // Realiza la suma de las matrices
	        
	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            resultado[i][j] = matriz1[i][j] + matriz2[i][j];
	        }
	    }

	    // Muestra el resultado
	        
	    System.out.println("Matriz 1:");
	    mostrarMatriz(matriz1);

	    System.out.println("\nMatriz 2:");
	    mostrarMatriz(matriz2);

	    System.out.println("\nResultado de la suma:");
	    mostrarMatriz(resultado);
	    
	}

}
