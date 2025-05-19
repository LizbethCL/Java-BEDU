import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Double> registrosCPU = new HashSet<>();
        int cantidadServidores = 5; // o puedes pedir al usuario la cantidad

        try {
            for (int i = 1; i <= cantidadServidores; i++) {
                System.out.print("Ingresa el consumo de CPU del servidor #" + i + " (%): ");
                String entrada = scanner.nextLine();

                try {
                    double consumo = Double.parseDouble(entrada);

                    // Validaciones
                    if (consumo < 0 || consumo > 100) {
                        System.out.println(" Error: El valor debe estar entre 0 y 100.");
                        i--; // Reintenta
                        continue;
                    }

                    if (!registrosCPU.add(consumo)) {
                        System.out.println(" Duplicado: Este valor ya fue registrado.");
                        i--; // Reintenta
                        continue;
                    }

                    if (consumo > 95) {
                        throw new ConsumoCriticoException(" Alerta crítica: consumo del " + consumo + "%");
                    }

                    System.out.println(" Registro aceptado: " + consumo + "%");

                } catch (NumberFormatException e) {
                    System.out.println(" Entrada inválida: Debes ingresar un número.");
                    i--; // Reintenta
                } catch (ConsumoCriticoException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println("\n Resumen de registros:");
            for (double c : registrosCPU) {
                System.out.println(" Servidor registrado con consumo: " + c + "%");
            }

        } finally {
            scanner.close();
            System.out.println("\n Recursos cerrados. Monitoreo finalizado.");
        }
    }
}
