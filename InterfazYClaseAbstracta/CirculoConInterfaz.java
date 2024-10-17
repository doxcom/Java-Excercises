package InterfazYClaseAbstracta;

public class CirculoConInterfaz implements InterfazFigura, InterfazDibujable,InterfazRotable{
    private double radio;

    public CirculoConInterfaz(){

    }

    public CirculoConInterfaz(double radio){
        this.radio = radio;
    }


    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;

        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo");
    }

    @Override
    public void rotar() {
        System.out.println("Rotando circulo");
    }
}
