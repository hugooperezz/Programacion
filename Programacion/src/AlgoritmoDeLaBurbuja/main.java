package AlgoritmoDeLaBurbuja;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int k = 0;
		 int burbuja[];
	        burbuja = new int[5];

	        burbuja[0] = 1;
	        burbuja[1] = 20;
	        burbuja[2] = 30;
	        burbuja[3] = 40;
	        burbuja[4] = 50;

	        System.out.println(burbuja[0] + " " + burbuja[1] + " " + burbuja[2] + " " + burbuja[3] + " " + burbuja[4]);

	        Scanner sc1 = new Scanner(System.in);
	        System.out.println("Ingrese el número de la posición del número que desea cambiar de posición");
	        int n = sc1.nextInt();
	        Scanner sc2 = new Scanner(System.in);
	        System.out.println("Ingrese el número de la posición del número por el que desea cambiar de posición");
	        int m = sc2.nextInt();

	        for (int i = 0; i < burbuja.length; i++) {
	        	for (int j = 0; j < burbuja.length; j++) {
	        		if ( m >= 0 && m < burbuja.length) {
	        			k = burbuja[n-1];
	        			burbuja[n-1] = burbuja[m-1];
	        			burbuja[m-1] = k;
	        		}
	        	}
	        }

	        for( int i = 0; i < burbuja.length; i++) {
	            System.out.println(burbuja[i] + " ");
	        }

	}

}
