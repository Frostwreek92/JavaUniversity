package animales;

public class Animal {

    protected void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal{
    @Override
    protected void hacerSonido() {
        System.out.println("El perro hace wauf");
    }
}

class Gato extends Animal {
    protected void hacerSonido() {
        System.out.println("El Gato hace miau");
    }
}

class PruebaAnimal {

    static void imprimirSonido(Animal animal) {
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        // Objeto de la clase Padre (Animal)
        // Animal animal = new Animal();
        // animal.hacerSonido();
        // Perro animal = new Perro();
        Gato animal = new Gato();
        imprimirSonido(animal);

    }
}