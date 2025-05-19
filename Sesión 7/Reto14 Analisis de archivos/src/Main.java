import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Path archivoLogs = Paths.get("errores.log");

        // Si no existe, lo crea con contenido de ejemplo
        if (!Files.exists(archivoLogs)) {
            crearArchivoDePrueba(archivoLogs);
        }

        analizarArchivo(archivoLogs);
    }

    private static void analizarArchivo(Path archivo) {
        int totalLineas = 0;
        int errores = 0;
        int advertencias = 0;

        try (BufferedReader reader = Files.newBufferedReader(archivo)) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    errores++;
                }
                if (linea.contains("WARNING")) {
                    advertencias++;
                }
            }

            // Mostrar resumen
            System.out.println(" Análisis completado:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + errores);
            System.out.println("Cantidad de advertencias: " + advertencias);

            double porcentaje = totalLineas > 0
                    ? ((errores + advertencias) * 100.0) / totalLineas
                    : 0.0;

            System.out.printf(" Porcentaje de líneas problemáticas: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.out.println(" Ocurrió un error al leer el archivo. Se registró en 'registro_fallos.txt'.");
            guardarError(e.getMessage());
        }
    }

    private static void guardarError(String mensaje) {
        try {
            Files.writeString(Paths.get("registro_fallos.txt"), mensaje);
        } catch (IOException ex) {
            System.out.println(" No se pudo guardar el registro del fallo.");
        }
    }

    private static void crearArchivoDePrueba(Path archivo) {
        List<String> contenidoEjemplo = List.of(
                "INFO: Inicio de ejecución",
                "WARNING: Variable sin inicializar",
                "ERROR: Falla en el subsistema A",
                "INFO: Verificación completa",
                "ERROR: Timeout en la conexión",
                "WARNING: Memoria al límite"
        );

        try {
            Files.write(archivo, contenidoEjemplo);
            System.out.println(" Archivo 'errores.log' generado con contenido de prueba.");
        } catch (IOException e) {
            System.out.println(" No se pudo crear el archivo de prueba.");
        }
    }
}
