package ar.edu.unahur.obj2.ejercicio6;

public class Usuario {

    private String tipoDeUsuario;

    public Usuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public String permisosLogin() {

        String permisosDeUsuario;

        if (tipoDeUsuario.equals("PROFESOR")) {
            permisosDeUsuario="Permisos de profesor";
        } else if (tipoDeUsuario.equals("ALUMNO")) {
            permisosDeUsuario="Permisos de alumno";
        } else if (tipoDeUsuario.equals("AYUDANTE")) {
            permisosDeUsuario="Permisos de ayudante";
        } else {
            throw new RuntimeException("Tipo de usuario inexistente");
        }

        return permisosDeUsuario;
    }
}
