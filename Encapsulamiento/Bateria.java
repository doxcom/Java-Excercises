package Encapsulamiento;
//esta clase delega "capacidad" a las clases Telefono  y Tablet
public class Bateria {

    private int capacidad;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    //su constructor:

    public Bateria(int capacidad) {
        super();
        this.capacidad = capacidad;
    }

    //su metodo propio
    public int duracionBateria(){
        if(capacidad<3000){
            return 16;
            
        }else{
            return 24;
        }
    }
}
