import java.util.Scanner;

class HelloCalculator {

    public static void main(String[] args) {

        System.out.println("CALCULADORA CON JAVA");
        int variableA; // varibles globales
        int variableB; // son globlales porque pueden ser llamadas
        int total; // desde cualquier parte del codigo
        String texto;
        char caracter;
        boolean bool = true;
        int contCaracteres;

        while (bool == true) {

            System.out.println("############################");
            System.out.println("Bienvenido a la calculadora");
            System.out.println("Elija la opcion");
            System.out.println("1.- SUMA");
            System.out.println("2.- RESTA");
            System.out.println("3.-Salir de Calculadora");
            System.out.println("############################");

            // pregunta la opcion
            Scanner lector = new Scanner(System.in); // Create a Scanner object
            texto = lector.next();// leer toda la cadena de texto;
            contCaracteres = texto.length(); // contamos los caracteres y si es mas de 1, lo ponemos en el if
            caracter = texto.charAt(0);// de todo el texto nos interesa la primera posicion

            if (caracter == '3' && contCaracteres < 2) {
                bool = false;// aqui cambiamos el estado del ciclo while
                System.out.println("ADIOS");
            } else if (caracter == '1' && contCaracteres < 2) {
                System.out.println("Haz elegido la opcion suma");
                System.out.println("ingrese el primer numero :");
                variableA = lector.nextInt(); // leemos entero A
                System.out.println("ingrese el segundo numero :");
                variableB = lector.nextInt(); // leemos entero B
                total = variableA + variableB;
                System.out.println("La SUMA es " + total);
            } else if (caracter == '2' && contCaracteres < 2) {
                System.out.println("Haz elegido la opcion de Resta");
                System.out.println("ingrese el primer numero :");
                variableA = lector.nextInt();
                System.out.println("ingrese el segundo numero :");
                variableB = lector.nextInt();
                total = variableA - variableB;
                System.out.println("LA RESTA es: " + total);
            } else {
                System.out.println("OPCION INCORRECTA");
                System.out.println("Numero de Caracteres :" + contCaracteres);
            }

        }

    }
}