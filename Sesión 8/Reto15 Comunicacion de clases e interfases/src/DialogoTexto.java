// Diálogo impreso en consola
public class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String texto) {
        System.out.println(" " + texto);
    }
}
