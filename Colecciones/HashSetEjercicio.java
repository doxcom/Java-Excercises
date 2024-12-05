package Colecciones;


import java.util.HashSet;

/*
* los elementos no están ordenados, no hay garantía de que estén en el mismo orden después de un tiempo.
* no duplicados:  la clase implementa la interfaz Set, solo puede almacenar valores únicos;
* puede almacenar valores null
* */
public class HashSetEjercicio {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Anthony");
        hs.add("Flea");
        hs.add("John Frusciante");
        hs.add("Chad Smith");
        hs.add("Flea"); //no imprimira los flea duplicados, x que flea no se puede duplicar ;)
        hs.add("Flea");

        System.out.println(hs);// imprime [Flea, Anthony, John Frusciante, Chad Smith]
          //no imprime en el orden en que los añadimos
    }
}
