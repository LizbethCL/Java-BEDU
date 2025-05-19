public class PagoTransferencia extends MetodoPago implements Autenticable {
    private boolean validacionBanco; // Simula validación externa

    public PagoTransferencia(double monto, boolean validacionBanco) {
        super(monto);
        this.validacionBanco = validacionBanco;
    }

    @Override
    public boolean autenticar() {
        // Simula validación bancaria externa
        return validacionBanco;
    }

    @Override
    public void procesarPago() {
        System.out.println(" Procesando transferencia por $" + monto);
    }
}
