package Herencia;

public class main {

	public static void main(String[] args) {
		
		// Crear una instancia de Perro (que es un tipo de Animal)
        Perro miPerro = new Perro("Rex");

        // Llamar a métodos de la superclase Animal
        System.out.println("Nombre del perro: " + miPerro.getNombre());
        miPerro.emitirSonido();

        // Llamar a métodos de la subclase Perro
        miPerro.perseguirCola();
    }

}
