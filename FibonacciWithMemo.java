import java.util.HashMap;
import java.util.Scanner;

public class FibonacciWithMemo {

    /*
     * el siguiente es el comienzo de la secuencia fibonacci, comenzando con
     * fibonacci de 0, que es cero en automatico
     * fibonacci secuencia: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
     * enteros secuencia "n" fibonacci(n) 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
     *
     * el calculo de la secuencia fibonacci dado n, seria n=(n-1)+(n-2)
     * en este caso no hay que confundir n-1 y n-2 con los numeros enteros si no con
     * los numeros fibonacci
     * ejemplo fibonacci de 5 seria 5 ya que es la suma de (n-1) el cual n es 5
     * menos 1 seria 4 y el fibonacci de
     * 4 es 3 tal cual vemos en la tabla de arriba, y la suma de (n-2) el cual n es
     * 5 menos 2 seria 3, y el fibonacci
     * de 3 es 2, entonces sumamos 3 y 2 y nos da a 5,lo que notamos es que no
     * hacemos restas literales de n-1(5-1) si
     * por lo cual la formula del fibonacci seria n=fibonacci(n-1)+ fibonacci(n-2)
     * llamamos recursivamente a la misma funcion
     * 
     */

    // Hashmap es declarado para almacenar pares de valores, tiene dos integers
    // en el primero se grabara el numero n de algun fibonacci ya calculado y en el
    // segundo se grabara
    // el valor del fibonacci, ejemplo el de fibonacci de 5, seria 5, estaria asi
    // <5,5>
    // cuando se haga la recursividad no vuelva a calcular usara la memoria de el
    // fibonacci ya calculado
    // dandole n como parametro, con el metodo fiboMapped.get lo obtendremos, y
    // cuando calculemos almacenaremos
    // el con fiboMapped.put, por lo cual esta estructura de datos nos ayudara en el
    // calculo
    private static HashMap<Integer, Integer> fiboMapped = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index;// es el numero n de entrada que nos pediran a calcular de fibonacci

        System.out.println("FIBONACCI Calculadora");
        System.out.println("Ingrese numero N a calcular ");
        index = sc.nextInt();

        System.out.println("El fibonacci de " + index + " es: " + fibowithmemo(index));

    }

    // este es un metodo tipo entero ya que solo leeremos "n" en entero
    // sera llamado en el metodo main, por lo cual esta escrito fuera de el
    private static int fibowithmemo(int index) { // esta funcion sera llamada multiples veces

        if (index <= 1)
            return index; // este seria el caso base, si index es 0, devolvera 0, si es 1 devolvera 1

        // en caso no sea 0 o 1 entonces procedemos a hacer lo siguiente
        if (fiboMapped.containsKey(index)) { // en este caso verificara si n(index es igual al primer valor del
                                             // hashmap<primer valor, segundo valor>
            return fiboMapped.get(index); // en este caso nos devolvera el segundo valor dependiendo del primero, por
                                          // ejemplo 5 si n es 5,hashmap <5,5>
        } else {
            int sum = fibowithmemo(index - 1) + fibowithmemo(index - 2); // calcular el fibonacci de los 2 numeros
                                                                         // anteriores
            // pero almacenarlo en el hashmap para evitar volver a calcularlo
            fiboMapped.put(index, sum); // en este caso si el "n" o index fuese 5 pondremos su valor el cual sabemos es
                                        // 5 tambien en el parametro sum
            // y devolveriamos el fibonacci a esta misma funcion fibowithmemo
            return sum;
        }
        // como vemos tenemos varios return, todos ellos seran devueltos al llamar esta
        // funcion de fibowithmemo
        // dependiendo del parametro de "n",index
    }

}
