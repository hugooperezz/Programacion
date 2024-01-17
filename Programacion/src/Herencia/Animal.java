package Herencia;

public class Animal {
	 private String nombre;

	    public Animal(String nombre) {
	        this.nombre = nombre;
	    }

	    public void emitirSonido() {
	        System.out.println("El animal emite un sonido.");
	    }

	    public String getNombre() {
	        return nombre;
	    }
}
