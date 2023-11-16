package EjercicioEquals;

public class Main {

	public static void main(String[] args) {
		
		//Inicializo todas las variables
		
		B b1 = new B(2);
		B b2 = new B(2);
		A a1 = new A(3,b1);
		A a2 = new A(3,b2);
		
		//Imprimo
		
		if ( a1.equals(a2) ) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
	}

}
