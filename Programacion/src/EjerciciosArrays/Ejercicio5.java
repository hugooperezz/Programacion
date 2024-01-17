package EjerciciosArrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int principalarray[];
		principalarray = new int[5];
		
		principalarray[0]= 2;
		principalarray[1]= 5;
		principalarray[2]= 7;
		principalarray[3]= 4;
		principalarray[4]= 6;
		System.out.println(principalarray[0] + " " + principalarray[1] + " " + principalarray[2] + " " + principalarray[3] + " " + principalarray[4]);
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Número a eliminar:");
		int n = sc1.nextInt();
		
		int finalarray[];
		finalarray = new int[principalarray.length];
		int j = 0;
		
		for (int i = 0; i < principalarray.length; i++) {
			if(principalarray[i] != n) {
				finalarray[j] = principalarray[i];
				j++;
			}
			else {
				finalarray[4] = principalarray[4];
			}
		}
		
		for(int i = 0; i < finalarray.length; i++) {
			System.out.println(finalarray[i] + " ");
		}


	}

}
