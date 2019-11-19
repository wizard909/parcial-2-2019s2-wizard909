package ar.edu.unahur.obj2.ejercicio1;


public class Carrera {

    String nombre;

    private Intro intro;
    private Matematica matematica;
    private EstructuraDeDatos estructuraDeDatos;
    private ObjetosI objetosI;
    //TODO faltan agregar 20  materias

    public Carrera(String nombre, Intro intro, Matematica matematica, EstructuraDeDatos estructuraDeDatos, ObjetosI objetosI) {
        this.nombre = nombre;
        this.intro = intro;
        this.matematica = matematica;
        this.estructuraDeDatos = estructuraDeDatos;
        this.objetosI = objetosI;
    }

    public int cargaHoraria() {
        int horasTotales = 0;

        if (intro.anual()) {
            horasTotales+=intro.horasSemanales()*17*2;
        } else {
            horasTotales+=intro.horasSemanales()*17;
        }

        if (matematica.cuatrimestral()) {
            horasTotales+=matematica.horasSemanales()*17;
        } else {
            horasTotales+=matematica.horasSemanales()*17*2;
        }

        if (estructuraDeDatos.semestral()) {
            horasTotales+=estructuraDeDatos.horas()*17;
        } else {
            horasTotales+=estructuraDeDatos.horas()*17*2;
        }

        if (objetosI.cuatrimestral()) {
            horasTotales+=objetosI.horasSemanales()*17;
        } else {
            horasTotales+=objetosI.horasSemanales()*17*2;
        }


        return horasTotales;
    }


}
