package Colecciones;

import java.util.HashSet;
import java.util.Set;

public class SetEjercicio {

    //set no permite duplicados
    //no almacena en orden los objetos
    //puede admitir null

    //variable set de tipo string
    /*
    why:  Set<String> variableSetName = new HashSet<>();
    and no:  Set<String> variableSetName = new Set<>();

    * Set is not a class, it is an interface.
      So basically you can instantiate only class implementing Set (HashSet, LinkedHashSet orTreeSet)
       For instance :
       Set<String> mySet = new HashSet<String>();
    * */

    public static void main(String[] args) {
        Set<String> setString = new HashSet<>();
        Set<Sinico> torturador = new HashSet<>();

        //agregamos los elementos a set
        setString.add("elemento1");
        setString.add("elemento2");
        setString.add("elemento3");
        setString.add("elemento3"); //no sera almacenado por ser duplicado

        System.out.println(setString); // [elemento3, elemento2, elemento1]
    }




}
