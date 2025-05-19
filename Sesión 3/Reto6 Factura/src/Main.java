//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Factura con RFC
        Factura facturaConRFC = new Factura(2500.0, "Servicio de consultoría", "ABCC010101XYZ");

        // Factura sin RFC (pasamos null)
        Factura facturaSinRFC = new Factura(1800.0, "Reparación de equipo", null);

        // Mostrar resúmenes
        System.out.println(facturaConRFC.getResumen());
        System.out.println();
        System.out.println(facturaSinRFC.getResumen());
    }
}