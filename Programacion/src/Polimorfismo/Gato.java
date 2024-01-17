package Polimorfismo;

class Gato extends Animal {
    @Override
    public void emitirSonido() {
        System.out.println("El gato maulla: ¡Miau, miau!");
    }
}
