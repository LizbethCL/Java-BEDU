// Transición simple de escena
public class TransicionSimple implements TransicionHistoria {
    @Override
    public void avanzarEscena() {
        System.out.println(" Transición a la siguiente escena...");
    }
}
