package ar.edu.unahur.obj2.ejercicio1;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.*;

public class CarreraTest {

    private EstructuraDeDatos estructuraDeDatos;
    private Intro intro;
    private Matematica matematica;
    private Carrera carrera;
    private ObjetosI objetos1;


    @BeforeTest
    public void setup() {
        estructuraDeDatos = new EstructuraDeDatos();
        intro = new Intro();
        matematica = new Matematica();
        objetos1 = new ObjetosI();
        carrera = new Carrera("Tecnicatura en sistemas", intro, matematica, estructuraDeDatos,objetos1 );
    }

    @org.testng.annotations.Test
    public void testCatalogoDePaquetes() {
        int cargaHoraria = carrera.cargaHoraria();
        assertEquals(cargaHoraria, 816);
    }
}