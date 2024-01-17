package Polimorfismo;

public class main {

	public static void main(String[] args) {
		
		// Crear instancias de las subclases
		Animal miAnimal1 = new Perro();
		Animal miAnimal2 = new Gato();

		// Llamar al método emitirSonido de las instancias
		miAnimal1.emitirSonido(); // Polimorfismo: llama al método de Perro
		miAnimal2.emitirSonido(); // Polimorfismo: llama al método de Gato

	}

}
