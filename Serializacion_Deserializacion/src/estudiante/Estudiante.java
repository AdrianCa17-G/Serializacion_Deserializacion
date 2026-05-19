package estudiante;

import java.io.Serializable;

public class Estudiante implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nombre;
    private String estado;

    public Estudiante(String nombre, String estado) {

        this.nombre = nombre;
        this.estado = estado;

    }

    public String getNombre() {

        return nombre;

    }

    public String getEstado() {

        return estado;

    }

    @Override
    public String toString() {

        return nombre + " - " + estado;

    }
}