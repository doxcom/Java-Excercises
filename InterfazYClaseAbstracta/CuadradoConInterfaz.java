package InterfazYClaseAbstracta;

public class CuadradoConInterfaz implements InterfazFigura, InterfazDibujable{


    private double lado;

    public CuadradoConInterfaz(){

    }

    public CuadradoConInterfaz(double lado){

        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Cuadrado Dibujado");
    }
}
