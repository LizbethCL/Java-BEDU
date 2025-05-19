public class PagoEfectivo extends MetodoPago implements Autenticable {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        // No requiere validación, siempre true
        return true;
    }

    @Override
    public void procesarPago() {
        System.out.println(" Procesando pago en efectivo por $" + monto);
    }
}
