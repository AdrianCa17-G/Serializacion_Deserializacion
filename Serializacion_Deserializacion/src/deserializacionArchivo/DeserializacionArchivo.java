package deserializacionArchivo;

import estudiante.Estudiante;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.util.ArrayList;

public class DeserializacionArchivo {

    private String nombreArchivo;

    private ArrayList<Estudiante> listaEstudiantes;

    public DeserializacionArchivo(String nombreArc) {

        nombreArchivo = nombreArc;

        listaEstudiantes = new ArrayList<>();

    }

    public void establecerEstudiantes() {

        try {

            ObjectInputStream entrada =
                    new ObjectInputStream(
                            new FileInputStream(nombreArchivo));

            while (true) {

                listaEstudiantes.add(
                        (Estudiante) entrada.readObject());

            }

        } catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {

            System.out.println("Error: " + e.getMessage());

        }
    }

    @Override
    public String toString() {

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < listaEstudiantes.size(); i++) {

            resultado.append(listaEstudiantes.get(i));
            resultado.append("\n");

        }

        return resultado.toString();
    }
}