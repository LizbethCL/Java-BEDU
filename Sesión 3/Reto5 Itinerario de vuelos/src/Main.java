//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        public static void main(String[] args) {
            // Crear un pasajero
            Pasajero pasajero1 = new Pasajero("Ana Martínez", "A123456");

            // Crear un vuelo
            Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

            // Reservar el asiento con un objeto Pasajero
            vuelo.reservarAsiento(pasajero1);

            // Mostrar itinerario
            System.out.println();
            System.out.println(vuelo.obtenerItinerario());

            // Cancelar la reserva
            System.out.println();
            vuelo.cancelarReserva();

            // Mostrar itinerario nuevamente
            System.out.println();
            System.out.println(vuelo.obtenerItinerario());

            // Reservar usando nombre y pasaporte directamente
            System.out.println();
            vuelo.reservarAsiento("Mario Gonzalez", "M987654");

            // Mostrar itinerario final
            System.out.println();
            System.out.println(vuelo.obtenerItinerario());
        }
    }
