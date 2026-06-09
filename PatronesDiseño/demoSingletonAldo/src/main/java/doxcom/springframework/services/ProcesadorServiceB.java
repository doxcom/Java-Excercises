package doxcom.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class ProcesadorServiceB {

    private final ContadorService contadorService;

    public ProcesadorServiceB(ContadorService contadorService){
        this.contadorService = contadorService;
        System.out.println(" Creando Procesador service B");
        System.out.println(" recibio el MISMO contador service: " + contadorService.getInfo());
    }

    public String registrarAccion(String accion){
        int numAccion = contadorService.incrementarYGet();
        return String.format(
                "AUDITORIA Accion '%s' registrada (evento #%d del sistema)",
                accion, numAccion
        );
    }
}
