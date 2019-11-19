package ar.edu.unahur.obj2.ejercicio3;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.testng.Assert.*;

public class ExtractorDeTextoTest {

    private Tag tag;
    private StringNodo stringNodo;
    private Link link;
    private Documento documento;


    @BeforeMethod
    public void setUp() {
        tag = new Tag("texto1");
        stringNodo = new StringNodo("texto2");
        link = new Link("texto3");
        documento = new Documento(Stream.of(tag, stringNodo, link).collect(Collectors.toList()));
    }

    @Test
    public void testExtractText() {
        ExtractorDeTexto extractorDeTexto = new ExtractorDeTexto();
        String resultado = extractorDeTexto.extraerTexto(documento);
        String esperado = "texto1" + "texto2" + "texto3";
        assertEquals(resultado, esperado);
    }
}