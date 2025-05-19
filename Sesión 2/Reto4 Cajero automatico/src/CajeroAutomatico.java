import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0; // Uso de 'var' para inferencia de tipo
        int opcion;

        do {
            // Menú
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" Saldo actual: $" + saldo);
                    break;

                case 2:
                    System.out.print(" Ingrese monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println(" Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;

                case 3:
                    System.out.print(" Ingrese monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println(" Fondos insuficientes, su saldo es: $" + saldo);
                        continue; // Saltar al siguiente ciclo sin restar
                    }
                    saldo -= retiro;
                    System.out.println(" Retiro exitoso. Nuevo saldo: $" + saldo);
                    break;

                case 4:
                    System.out.println(" Gracias por usar el cajero. ¡Hasta pronto!");
                    break;

                default:
                    System.out.println(" Opción inválida, intente de nuevo.");
                    continue; // Volver al menú sin hacer nada
            }

        } while (opcion != 4);

        scanner.close();
    }
}
