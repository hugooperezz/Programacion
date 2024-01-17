package OrdenacionPorInsercion;

public class main {

	public static void main(String[] args) {
		
		//Creo el array
		
		int[] array = new int []{30,80,20,10,40,50};
		int n = array.length;
		
		//Array impreso desordenado
		
		System.out.println("Array desordenado");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
				
		System.out.println(" ");
		
		//Ordeno el array 
		
		int numeros;
		
		for (int i = 1; i < array.length; i++) {
			numeros	= array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > numeros) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1]= numeros;
		}
		
		//Imprimir el array ordenado
		
		System.out.println("Array ordenado");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
