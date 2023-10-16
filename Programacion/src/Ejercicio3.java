import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc3 = new Scanner(System.in);
			System.out.println("Introduzca un numero");
				int nparoimpar = sc3.nextInt();
				
		if (nparoimpar % 2 == 0) {
			System.out.println("Tu numero es par");
		}else {
			System.out.println("Tu numero es impar");
		}

	}

}
