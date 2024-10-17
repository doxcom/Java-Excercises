package Encapsulamiento;

public class Telefono {

    private String marca;
  //  private int capacidad; ya no tendria que declararse capacidad aqui, se puede heredar de otra clase: la clase bateria
    private Bateria bateria; //la clase bateria debe estar dentro de el mismo paquete que Telefono.java

    //sus metodos get y set
    //nos permiten acceder a los valores o propiedades de un objeto sin revelar la forma en que se implementan

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public int getCapacidad(){
        return bateria.getCapacidad(); //ahora aqui podemos obtener la capacidad accediendo al objeto bateria
    }

    //constructor
    public Telefono(String marca, int capacidad){
        super();
      this.marca = marca;
      this.bateria = new Bateria(capacidad);
    }

    public int duracionBateria(){
      //no tenemos que definir accion aqui, solo usar el metodo que bateria ya tiene

        return bateria.duracionBateria();
    } 

    //el mismo ejemplo aplica para la clase Tablet, lo cual es un objeto en comun con Telefono
}
