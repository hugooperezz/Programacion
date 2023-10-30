package EjerciciosStringChar;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static String invertir (String cadena) {

        return new StringBuilder(cadena).reverse().toString();

    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduce una palabra");
		
		String n = sc.nextLine();
        String invert = invertir(n);
        
        if (n.equals(invert)) {
        	System.out.println("Es una palindromo");
        } else {
        	System.out.println("No es un palindromo");
        }
        
        sc.close();
        
	}

}
