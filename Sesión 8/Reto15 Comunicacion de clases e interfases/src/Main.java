public class Main {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    // Inyección de dependencias
    public Main(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("Una figura misteriosa aparece en el bosque...");
        boolean respuesta = decision.tomarDecision();

        if (respuesta) {
            dialogo.mostrarDialogo("Has decidido ayudar. ¡El destino del bosque cambiará contigo!");
        } else {
            dialogo.mostrarDialogo("Ignoras la petición de ayuda. La oscuridad se extiende.");
        }

        transicion.avanzarEscena();
    }

    public static void main(String[] args) {
        // Inyectamos dependencias con implementaciones concretas
        TransicionHistoria transicion = new TransicionSimple();
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();

        Main juego = new Main(transicion, dialogo, decision);
        juego.ejecutarEscena();
    }
}
