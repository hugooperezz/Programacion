package Herencia;

public class Perro extends Animal {
	
	public Perro(String nombre) {
        super(nombre);
    }

    // Override del método emitirSonido para personalizarlo
    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " ladra: ¡Guau, guau!");
    }

    public void perseguirCola() {
        System.out.println(getNombre() + " está persiguiendo su cola.");
    }
}
