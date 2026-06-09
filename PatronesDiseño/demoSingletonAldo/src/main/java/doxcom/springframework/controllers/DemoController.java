package doxcom.springframework.controllers;

import doxcom.springframework.services.ContadorService;
import doxcom.springframework.services.ProcesadorServiceA;
import doxcom.springframework.services.ProcesadorServiceB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    private final ContadorService contadorService;
    private final ProcesadorServiceA procesadorServiceA;
    private final ProcesadorServiceB procesadorServiceB;

    public DemoController(ContadorService contadorService, ProcesadorServiceA procesadorServiceA,
                          ProcesadorServiceB procesadorServiceB){
        this.contadorService = contadorService;
        this.procesadorServiceA = procesadorServiceA;
        this.procesadorServiceB = procesadorServiceB;
    }

    @GetMapping("/info")
    public String getInfo(){
        return contadorService.getInfo();
    }

    @GetMapping("/processA")
    public String procesar(@RequestParam String dato) {
        return procesadorServiceA.procesar(dato);
    }

    @GetMapping("/processB")
    public String registrarAccion(@RequestParam String dato) {
        return procesadorServiceB.registrarAccion(dato);
    }



}
