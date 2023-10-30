package EjerciciosStringChar;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce una frase");
	        String frase = sc.nextLine().toLowerCase();
	        
		Scanner sc2 = new Scanner(System.in);
			System.out.println("Elija la letra de su frase que quiera remplazar");
	        String original = sc2.nextLine().toLowerCase();
	        
		Scanner sc3 = new Scanner(System.in);    
	    	System.out.println("Elija la letra por la cual quiere que sea remplazada");
	        String cambio = sc3.nextLine().toLowerCase();
        
        String frasenueba = frase.replace(original, cambio); //Metodo para cambiar las letras por las que le indico
        
        System.out.println( frasenueba );
        
        sc.close();
        sc2.close();
        sc3.close();

	}

}
