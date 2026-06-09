package HashmapModule;

import java.util.HashMap;

public class HashMapExample {

    //agenda telefonica

    public static void main(String[] args) {
        System.out.println("ejemplo hashmap");

        //guarda clave y valor
        HashMap<String,String > agenda = new HashMap<>();

        System.out.println("1 agregar elementos");

        agenda.put("aldo","0430394095");
        agenda.put("gustavo","043280394095");
        agenda.put("tom","043039434395");

        System.out.println("agenda contactos lista:" + agenda);
        System.out.println("numero contactos: " + agenda.size());


    }
}
