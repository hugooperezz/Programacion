import java.util.Scanner;

public class Ejercio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduzca su nota del examen del 0 al 100");
				int nota = sc.nextInt();
			
		if (nota >= 60) {
			System.out.println("Felicidades has aprobado con un " + nota);
		} else {
			System.out.println("Lo siento has suspendido con un " + nota);
		}

		sc.close();
	}

}
