// Decisión binaria (sí/no) desde consola
import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public boolean tomarDecision() {
        System.out.print(" ¿Quieres ayudar al personaje? (s/n): ");
        String entrada = scanner.nextLine().trim().toLowerCase();
        return entrada.equals("s");
    }
}
