package doxcom.springframework.services;


import org.springframework.stereotype.Service;

@Service
public class ProcesadorServiceA {

    private final ContadorService contadorService;

    //inyeccion por constructor

    public ProcesadorServiceA(ContadorService contadorService){
        this.contadorService = contadorService;
        System.out.println("creando Procesador Service");
        System.out.println(" > Recibio Contador Service " + contadorService.getInfo());
    }

    public String procesar(String dato){
        int llamadaNumero = contadorService.incrementarYGet();
        return String.format(
                "Procesado '%s' (llamada #%d del sistema)",
                dato, llamadaNumero
        );
    }

}
