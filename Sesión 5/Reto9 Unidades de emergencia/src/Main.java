//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear operadores
        Operador operadorAmbulancia = new Operador("Juan");
        Operador operadorPatrulla = new Operador("Laura");
        Operador operadorBomberos = new Operador("Marco");

        // Crear unidades
        Ambulancia ambulancia = new Ambulancia("Ambulancia", operadorAmbulancia);
        Patrulla patrulla = new Patrulla("Patrulla", operadorPatrulla);
        UnidadBomberos bomberos = new UnidadBomberos("UnidadBomberos", operadorBomberos);

        // Ejecutar operaciones
        ambulancia.iniciarOperacion();
        System.out.println();
        patrulla.iniciarOperacion();
        System.out.println();
        bomberos.iniciarOperacion();
    }
}