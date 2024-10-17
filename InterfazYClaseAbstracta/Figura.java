package InterfazYClaseAbstracta;



public abstract class Figura {
    //protected de esta manera solo sus hijas circulo y cuadrado puedan verlo
    protected Figura(){
    }

    protected  Figura(double x, double y){
        this.x = x;
        this.y = y;
    }


    //dos atributos muy comunes

    protected double x;
    protected double y;

    //sin implementacion, circulo y cuadrado pueden implementarlo como quiera
   public abstract double calcularArea();
}
