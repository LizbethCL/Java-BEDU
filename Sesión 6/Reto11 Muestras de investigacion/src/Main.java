import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
        public static void main(String[] args) {
            // Paso 1: ArrayList para registrar todas las especies en orden
            ArrayList<String> muestras = new ArrayList<>();
            muestras.add("Homo sapiens");
            muestras.add("Mus musculus");
            muestras.add("Arabidopsis thaliana");
            muestras.add("Homo sapiens");

            // Paso 2: HashSet para filtrar especies únicas
            HashSet<String> especiesUnicas = new HashSet<>(muestras);

            // Paso 3: HashMap para asociar ID de muestra con investigador
            HashMap<String, String> idInvestigador = new HashMap<>();
            idInvestigador.put("M-001", "Dra. López");
            idInvestigador.put("M-002", "Dr. Hernández");
            idInvestigador.put("M-003", "Dra. García");

            // Paso 4: Mostrar resultados

            // Mostrar la lista ordenada de todas las muestras
            System.out.println(" Lista ordenada de muestras recibidas:");
            for (int i = 0; i < muestras.size(); i++) {
                System.out.println("Muestra " + (i + 1) + ": " + muestras.get(i));
            }

            // Mostrar las especies únicas
            System.out.println("\n Especies únicas procesadas:");
            for (String especie : especiesUnicas) {
                System.out.println("- " + especie);
            }

            // Mostrar la relación ID de muestra → Investigador
            System.out.println("\n Relación ID de muestra → Investigador:");
            for (String id : idInvestigador.keySet()) {
                System.out.println(id + " → " + idInvestigador.get(id));
            }

            // Búsqueda por ID de muestra
            String idBusqueda = "M-002";
            System.out.println("\n Búsqueda de muestra por ID: " + idBusqueda);
            if (idInvestigador.containsKey(idBusqueda)) {
                System.out.println("Investigador responsable: " + idInvestigador.get(idBusqueda));
            } else {
                System.out.println(" No se encontró ningún investigador con ese ID.");
            }
        }
    }
