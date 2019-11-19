package ar.edu.unahur.obj2.ejercicio3;

import java.util.List;

public class Documento {

    private List<Nodo> nodos;

    public Documento(List<Nodo> nodos) {
        this.nodos = nodos;
    }

    public List<Nodo> nodes() {
        return nodos;
    }
}
