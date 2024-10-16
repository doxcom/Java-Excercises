package Polimorfismo;

public class Main {

    //en esta clase podemos usar los objetos Cat y Dog, creamos dos variables de referencia tipo Animal y las
    //apuntamos a los objetos Cat y Dog
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();

        //podemos usar sus metodos

        a.makeSound(); //Woof

        b.makeSound(); // Miauuu

    }
}
