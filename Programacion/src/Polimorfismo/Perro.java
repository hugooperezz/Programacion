package Polimorfismo;

class Perro extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra: ¡Guau, guau!");
    }
}
