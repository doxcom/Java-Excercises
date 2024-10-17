package Polimorfismo;

public class Cat extends Animal {

    //con la anotacion Override indicamos una sobreescritura del metodo
    /*
    * Sobrescribir un método significa redefinir un método de una superclase en una subclase, con una implementación distinta
    * en este caso el metodo makeSound que heredamos de la Clase Animal usaremos Miauu como valor en vez de Grr..
    * */
    @Override
    public void makeSound() {
        //super.makeSound("Miau");
        super.makeSound();
    }
}
