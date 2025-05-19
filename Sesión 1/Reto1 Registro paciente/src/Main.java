import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear instancia de Paciente
        Paciente paciente = new Paciente();

        // Pedir datos al usuario
        System.out.print("Nombre del paciente: ");
        String nombre = scanner.nextLine();
        paciente.setNombre(nombre);

        System.out.print("Edad del paciente: ");
        int edad = scanner.nextInt();
        scanner.nextLine();  // consumir el salto de línea
        paciente.setEdad(edad);

        System.out.print("Número de expediente: ");
        String expediente = scanner.nextLine();
        paciente.setExpediente(expediente);

        System.out.println();  // línea en blanco
        // Mostrar la información
        paciente.mostrarInformacion();

        scanner.close();
    }
}