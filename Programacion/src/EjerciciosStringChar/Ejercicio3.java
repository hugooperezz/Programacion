package EjerciciosStringChar;

import java.util.Scanner;

/**
 * Esta es la unica clase de mi programa
 */

public class Ejercicio3 {

	/**
	 * Este es el punto de entrada de mi programa
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		System.out.println("Introduce una frase");
        
		Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        n = n.toLowerCase();

        String[] a = n.split("a", -1);
        String[] e = n.split("e", -1);
        String[] i = n.split("i", -1);
        String[] o = n.split("o", -1);
        String[] u = n.split("u", -1);
        int cont1 = a.length -1;
        int cont2 = e.length -1;
        int cont3 = i.length -1;
        int cont4 = o.length -1;
        int cont5 = u.length -1;

        System.out.println(cont1 + cont2 + cont3 + cont4 + cont5);
        
        sc.close();

	}

}
