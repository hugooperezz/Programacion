import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc4 = new Scanner(System.in);
			System.out.println("Introduzca su año de nacimiento");
				int añonacimiento = sc4.nextInt();
				int añoactual = 2023;
		
		if (añoactual - añonacimiento >= 18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Todavia eres menor perro");
		}

	}

}
