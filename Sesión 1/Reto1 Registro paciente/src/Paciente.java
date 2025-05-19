import java.util.Scanner;

public class Paciente {
    // Atributos
    private String nombre;
    private int edad;
    private String expediente;

    // Constructor vacío (opcional)
    public Paciente() { }

    // Métodos getters y setters (opcional, pero recomendado)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    // Metodo para mostrar información
    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + expediente);
    }
}
