package ar.edu.unahur.obj2.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class AgenciaDeViajes {

    /*
    private PaqueteCuyo paqueteCuyo;
    private PaqueteNOA paqueteNOA;
    private PaquetePatagonia paquetePatagonia;

     */

    List<Paquete> paquetes;

    public AgenciaDeViajes(PaqueteCuyo paqueteCuyo, PaqueteNOA paqueteNOA, PaquetePatagonia paquetePatagonia) {
        paquetes = new ArrayList<>();
        paquetes.add(paqueteCuyo);
        paquetes.add(paqueteNOA);
        paquetes.add(paquetePatagonia);
    }

    public void catalogoDePaquetes() {
        paquetes.stream().forEach(paquete -> paquete.imprimir());
    }


}
