package InterfazYClaseAbstracta;

public class Cuadrado extends Figura{

    private double lado;

    public Cuadrado(double lado){

    }
    //x y lo obtiene de su clase madre figura
    public Cuadrado(double lado, double x, double y){
        super(x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;

        return resultado;
    }
}
