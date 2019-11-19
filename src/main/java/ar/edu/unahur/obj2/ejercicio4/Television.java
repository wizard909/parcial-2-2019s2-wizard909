package ar.edu.unahur.obj2.ejercicio4;

public class Television {

    private final static int VOLUMEN_MAXIMO = 100;
    private final static int VOLUMEN_MINIMO = 2;


    private boolean encendido;
    private boolean silenciado;

    private int nivelVolumen;


    public void encender() {
        if (!encendido) {
            encendido = true;
        }
        else {
            System.out.println("TV encendida");
        }
    };

    public void apagar() {
        if (encendido) {
            encendido = false;
        }
        else {
            System.out.println("TV apagada");
        }
    }

    public void subirVolumen(int cantidad) {
        if (encendido && !silenciado && (nivelVolumen < VOLUMEN_MAXIMO)) {
            nivelVolumen += cantidad;
            if (nivelVolumen > VOLUMEN_MAXIMO)
                nivelVolumen = VOLUMEN_MAXIMO;
        } else if (!encendido) {
            System.out.println("TV apagada");
        } if (nivelVolumen >= VOLUMEN_MAXIMO) {
            System.out.println("TV volumen máximo");
        } else {
            System.out.println("TV silenciada");
        }
    }

    public void bajarVolumen(int cantidad) {
        if (encendido && !silenciado && (nivelVolumen > VOLUMEN_MINIMO)) {
            nivelVolumen -= cantidad;
            if (nivelVolumen < VOLUMEN_MINIMO)
                nivelVolumen = VOLUMEN_MINIMO;
        } else if (!encendido) {
            System.out.println("TV apagada");
        } if (nivelVolumen >= VOLUMEN_MAXIMO) {
            System.out.println("TV volumen mínimo");
        } else {
            System.out.println("TV silenciada");
        }
    }

    public void silenciar() {
        if (encendido && !silenciado) {
            silenciado = true;
        } else if (!encendido) {
            System.out.println("TV apagada");
        } else {
            System.out.println("TV silenciada");
        }
    }

    public void activarSonido() {
        if (encendido && silenciado) {
            silenciado = false;
        } else if (!encendido) {
            System.out.println("TV apagada");
        } else {
            System.out.println("TV sonido activado");
        }
    }


}
