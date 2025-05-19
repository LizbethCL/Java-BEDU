public class PagoTarjeta extends MetodoPago implements Autenticable {
    private double saldoDisponible;

    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public boolean autenticar() {
        // Autentica si hay saldo suficiente
        return saldoDisponible >= monto;
    }

    @Override
    public void procesarPago() {
        System.out.println(" Procesando pago con tarjeta por $" + monto);
    }
}
