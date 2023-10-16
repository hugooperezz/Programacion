import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc2 = new Scanner(System.in);
			System.out.println("Introduzca un numero");
				int numero = sc2.nextInt();
		
				if (numero < 0) {
					System.out.println("Tu numero es negativo");
				}else if (numero == 0){
					System.out.println("Tu numero es 0");
				}else if (numero > 0) {
					System.out.println("Tu numero es positivo");
				}



	}

}
