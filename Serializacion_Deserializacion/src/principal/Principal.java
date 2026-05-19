package principal;

import estudiante.Estudiante;

import serializacionArchivo.SerializacionArchivo;
import deserializacionArchivo.DeserializacionArchivo;

public class Principal {

    public static void main(String[] args) {

        String nombreArchivo = "estudiantes.data";

        Estudiante estudiante1 =
                new Estudiante(
                        "Tara Hernandez",
                        "matriculado");

        Estudiante estudiante2 =
                new Estudiante(
                        "Gregory Walsh",
                        "matriculado");

        Estudiante estudiante3 =
                new Estudiante(
                        "Kevin Page",
                        "matriculado");

        // SERIALIZACIÓN

        SerializacionArchivo archivo =
                new SerializacionArchivo(nombreArchivo);

        archivo.establecerRegistroEstudiante(estudiante1);
        archivo.establecerSalida();

        archivo.establecerRegistroEstudiante(estudiante2);
        archivo.establecerSalida();

        archivo.establecerRegistroEstudiante(estudiante3);
        archivo.establecerSalida();

        archivo.cerrarArchivo();

        // DESERIALIZACIÓN

        DeserializacionArchivo lectura =
                new DeserializacionArchivo(nombreArchivo);

        lectura.establecerEstudiantes();

        System.out.println(lectura);
    }
}