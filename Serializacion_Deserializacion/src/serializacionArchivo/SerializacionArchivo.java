package serializacionArchivo;

import estudiante.Estudiante;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializacionArchivo {

    private String nombreArchivo;

    private ObjectOutputStream salida;

    private Estudiante registroEstudiante;

    public SerializacionArchivo(String nombreArc) {

        nombreArchivo = nombreArc;

        try {

            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));

        } catch (IOException e) {

            System.out.println("Error al abrir archivo.");

        }
    }

    public void establecerRegistroEstudiante(Estudiante e) {

        registroEstudiante = e;

    }

    public void establecerSalida() {

        try {

            salida.writeObject(registroEstudiante);

        } catch (IOException e) {

            System.out.println("Error al escribir.");

        }
    }

    public void cerrarArchivo() {

        try {

            salida.close();

        } catch (IOException e) {

            System.out.println("Error al cerrar archivo.");

        }
    }
}