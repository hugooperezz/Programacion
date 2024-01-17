package EjerciciosStringChar;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static String invertir (String cadena) {

        return new StringBuilder(cadena).reverse().toString();

    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduce una palabra");
		
		String frase = sc.nextLine();
        String frase_invertida = invertir(frase);
        
        if (frase.equals(frase_invertida)) {
        	System.out.println("Es una palindromo");
        } else {
        	System.out.println("No es un palindromo");
        }
        
        sc.close();
        
	}

}
