import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
        Path rutaArchivo = Paths.get("config/parametros.txt");

        // Guardar parámetros
        guardarParametros(rutaArchivo);

        // Validar existencia
        if (Files.exists(rutaArchivo)) {
            System.out.println(" Archivo creado correctamente.");

            // Leer y mostrar contenido
            String contenido = leerParametros(rutaArchivo);
            System.out.println("\n Contenido del archivo:");
            System.out.println(contenido);
        } else {
            System.out.println(" Error: No se pudo crear el archivo.");
        }
    }

    // Método para guardar parámetros
    public static void guardarParametros(Path ruta) {
        try {
            // Crear carpeta config si no existe
            if (!Files.exists(ruta.getParent())) {
                Files.createDirectories(ruta.getParent());
            }

            // Contenido del archivo
            String parametros = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

            // Escribir en el archivo
            Files.writeString(ruta, parametros);
        } catch (IOException e) {
            System.out.println(" Error al guardar parámetros: " + e.getMessage());
        }
    }

    // Método para leer el archivo
    public static String leerParametros(Path ruta) {
        try {
            return Files.readString(ruta);
        } catch (IOException e) {
            return " Error al leer el archivo: " + e.getMessage();
        }
    }
}
