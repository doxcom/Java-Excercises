package doxcom.springframework.services;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

//todos los que usen este servicio reciben la MISMA instancia
@Service
public class ContadorService {
   //estado compartido propio del singleton

    private AtomicInteger contadorLlamadas = new AtomicInteger(0);
    private final LocalDate horaCreacion;

    public ContadorService(){
        this.horaCreacion = LocalDate.from(LocalDateTime.now());
        System.out.println(" SINGLETON se ha creado la instancia de Contador Service");
        System.out.println(" > "+ this.toString()); //la hora
    }

    public int incrementarYGet() {
        int nuevoValor = contadorLlamadas.incrementAndGet();
        System.out.println("   📊 Contador ahora: " + nuevoValor);
        return nuevoValor;
    }

    public int getContador() {
        return contadorLlamadas.get();
    }

    public LocalDateTime getHoraCreacion() {
        return horaCreacion;
    }

    public String getInfo() {
        return String.format(
                "ContadorService [instancia=%s, creado=%s, llamadas=%d]",
                this.toString().substring(0, 30),
                horaCreacion,
                contadorLlamadas.get()
        );
    }
}
