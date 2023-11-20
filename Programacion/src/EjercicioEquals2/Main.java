package EjercicioEquals2;

public class Main {

	public static void main(String[] args) {
		
		//Inicializo todas las variables
		
		Salon muebles = new Salon(2,6);
		Salon muebles2 = muebles;
		Casa casa1 = new Casa('s', muebles);
		Casa casa2 = casa1;
		Persona edad = new Persona (2, muebles, casa1);
		Persona edad2 = edad;
		
		//Imprimo
		
		if ( muebles.equals(muebles2) ) { //Le digo q en caso de q compare muebles y en caso de q sea cierto imprima verdadero
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		if ( casa1.equals(casa2) ) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}
		
		if ( edad.equals(edad2) ) {
			System.out.println("Cierto");
		} else {
			System.out.println("Falso");
		}

	}

}
