package Colecciones;


import java.util.ArrayList;

//arraylist es dinamico,pertenece a java collections
//es opcion cuando la longitud de la lista puede variar, almacena objetos
//ideal para busqueda u ordenacion
public class ArrayListEjercicio {

    public static void main(String[] args) {
        //utiliza la clase wrapper, x lo que debemos usar objetos en vez de datos primitivos
        //Integer en vez de int, etc
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(190);
        arrayList.add(200);
        arrayList.add(32);
        arrayList.add(44904);
        System.out.println(arrayList);
        arrayList.sort(Integer::compareTo);
        System.out.println(arrayList);//salida ordenada



        ArrayList<String> arrayString = new ArrayList<>();
        arrayString.add("uno");
        arrayString.add("uno");
        arrayString.add(null);

    }
}
