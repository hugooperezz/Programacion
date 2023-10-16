import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc5 = new Scanner(System.in);
			System.out.println("Introduzca un numero");
				int nrango = sc5.nextInt();
		
		if (nrango > 100) {
			System.out.println(nrango + " esta fuera del rango");
		}else if (nrango < 0) {
			System.out.println(nrango + " esta fuera del rango");
		}else {
			System.out.println(nrango + " esta dentro del rango");
		}

	}

}
