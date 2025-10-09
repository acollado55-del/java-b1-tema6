import java.util.*;

/**
 * Registro de envíos
 * -------------------
 * En una empresa de logística se necesita registrar los destinos asociados a cada paquete.
 *
 * Cada paquete tiene un identificador único y puede tener varios destinos asociados.
 * Se requiere implementar un sistema que:
 *  - Registre un nuevo paquete con sus destinos.
 *  - Añada destinos adicionales a un paquete.
 *  - Liste todos los identificadores de paquetes.
 *  - Obtenga un conjunto de todos los destinos únicos (sin duplicados).
 *  - Muestre todos los paquetes con sus destinos.
 *  - Elimine un paquete del registro.
 *
 * Se recomienda usar un Map<String, Set<String>> donde:
 *  - La clave es el ID del paquete.
 *  - El valor es un Set con los destinos (para evitar duplicados).
 *
 * MÉTODOS A IMPLEMENTAR:
 * -----------------------
 * - Map<String, Set<String>> createShippingRegistry()
 *     -> Devuelve un nuevo registro vacío de envíos.
 *
 * - void registerPackage(Map<String, Set<String>> registry, String packageId, Set<String> destinations)
 *     -> Registra un nuevo paquete con sus destinos.
 *
 * - void addDestination(Map<String, Set<String>> registry, String packageId, String destination)
 *     -> Añade un destino a un paquete ya existente. Si ya existe, se ignora.
 *
 * - List<String> listPackages(Map<String, Set<String>> registry)
 *     -> Devuelve una lista con todos los identificadores de paquetes.
 *
 * - Set<String> getAllDestinations(Map<String, Set<String>> registry)
 *     -> Devuelve un conjunto con todos los destinos únicos de los registros, sin repeticiones.
 *
 * - void printRegistry(Map<String, Set<String>> registry)
 *     -> Muestra todos los paquetes con sus destinos.
 *
 * - void removePackage(Map<String, Set<String>> registry, String packageId)
 *     -> Elimina completamente un paquete del registro.
 *
 * En este ejercicio las funciones no forman parte de una clase que almacena internamente el estado
 * (por ejemplo, una lista de tareas), sino que operan sobre listas que se pasan como parámetro.
 * Esta manera de trabajar no es la más habitual en programación orientada a objetos, ya que va 
 * en contra del principio de encapsulamiento: los datos (como la lista de tareas) no se ocultan
 * dentro de la clase. En este ejercicio, se utiliza con fines didácticos. Por otra parte,
 * las ventajas de esta implementación es que favorece la independencia entre funciones y datos (loose coupling)
 * y facilita trabajar con listas ya existentes sin tener que rediseñarlas.
 *
 * EJEMPLO:
 * --------
 * Map<String, Set<String>> registry = createShippingRegistry();
 * registerPackage(registry, "PKG001", Set.of("Madrid", "Barcelona"));
 * registerPackage(registry, "PKG002", Set.of("Valencia"));
 * addDestination(registry, "PKG002", "Sevilla");
 * addDestination(registry, "PKG002", "Valencia"); // Ignorado, ya existe
 *
 * System.out.println(listPackages(registry));          // [PKG001, PKG002]
 * System.out.println(getAllDestinations(registry));    // [Madrid, Barcelona, Valencia, Sevilla]
 * printRegistry(registry);
 *
 * removePackage(registry, "PKG001");
 * printRegistry(registry);
 *
 * // SALIDA:
 * // [PKG001, PKG002]
 * // [Madrid, Barcelona, Valencia, Sevilla]
 * // PKG001 -> [Madrid, Barcelona]
 * // PKG002 -> [Valencia, Sevilla]
 * // PKG002 -> [Valencia, Sevilla]
 *
 * ---
 *
 * Registre d’enviaments
 * ----------------------
 * En una empresa de logística, es vol portar un registre dels destins associats a cada paquet.
 *
 * Cada paquet té un identificador únic i pot tenir diversos destins.
 * Cal implementar un sistema que:
 *  - Registri un nou paquet amb els seus destins.
 *  - Afegeixi nous destins a un paquet existent.
 *  - Llisti tots els identificadors de paquets.
 *  - Retorni un conjunt de tots els destins únics (sense repeticions).
 *  - Mostri per pantalla tots els paquets amb els seus destins.
 *  - Elimini un paquet del registre.
 *
 * Es recomana utilitzar un Map<String, Set<String>> on:
 *  - La clau és l’identificador del paquet.
 *  - El valor és un Set amb els destins (per evitar duplicats).
 *
 * MÈTODES A IMPLEMENTAR:
 * -----------------------
 * - Map<String, Set<String>> createShippingRegistry()
 *     -> Retorna un registre buit.
 *
 * - void registerPackage(Map<String, Set<String>> registry, String packageId, Set<String> destinations)
 *     -> Registra un nou paquet amb els seus destins.
 *
 * - void addDestination(Map<String, Set<String>> registry, String packageId, String destination)
 *     -> Afegeix un destí a un paquet existent. Si ja existeix, s’ignora.
 *
 * - List<String> listPackages(Map<String, Set<String>> registry)
 *     -> Retorna una llista amb tots els identificadors de paquets.
 *
 * - Set<String> getAllDestinations(Map<String, Set<String>> registry)
 *     -> Retorna un conjunt amb tots els destins únics dels registres, sense repeticions
 *
 * - void printRegistry(Map<String, Set<String>> registry)
 *     -> Mostra per pantalla tots els paquets i els seus destins.
 *
 * - void removePackage(Map<String, Set<String>> registry, String packageId)
 *     -> Elimina completament un paquet del registre.
 *
 * En aquest exercici les funcions no formen part d'una classe que emmagatzema internament l'estat 
 * (per exemple, una llista de tasques), sinó que operen sobre llistes que es passen com a paràmetre. 
 * Aquesta manera de treballar no és la més habitual en programació orientada a objectes, ja que va 
 * en contra del principi d'encapsulament: les dades (com la llista de tasques) no s'amaguen 
 * dins de la classe. En aquest exercici, es fa servir amb fins didàctics. D'altra banda, 
 * els avantatges d'aquesta implementació és que afavoreix la independència entre funcions i dades (loose coupling) 
 * i facilita treballar amb llistes ja existents sense haver de redissenyar-les.
 *
 * EXEMPLE:
 * --------
 * Map<String, Set<String>> registry = createShippingRegistry();
 * registerPackage(registry, "PKG001", Set.of("Madrid", "Barcelona"));
 * registerPackage(registry, "PKG002", Set.of("Valencia"));
 * addDestination(registry, "PKG002", "Sevilla");
 * addDestination(registry, "PKG002", "Valencia"); // Ignorat, ja existeix
 *
 * System.out.println(listPackages(registry));          // [PKG001, PKG002]
 * System.out.println(getAllDestinations(registry));    // [Madrid, Barcelona, Valencia, Sevilla]
 * printRegistry(registry);
 *
 * removePackage(registry, "PKG001");
 * printRegistry(registry);
 *
 * // SALIDA:
 * // [PKG001, PKG002]
 * // [Madrid, Barcelona, Valencia, Sevilla]
 * // PKG001 -> [Madrid, Barcelona]
 * // PKG002 -> [Valencia, Sevilla]
 * // PKG002 -> [Valencia, Sevilla]
 */
public class ShippingRegistry {

    public static Map<String, Set<String>> createShippingRegistry() {
        // TODO: Return a new empty HashMap
        return null;
    }

    public static void registerPackage(Map<String, Set<String>> registry, String packageId, Set<String> destinations) {
        // TODO: Add packageId and its destinations to the map (can replace if exists)
    }

    public static void addDestination(Map<String, Set<String>> registry, String packageId, String destination) {
        // TODO: Add a destination to an existing package (if packageId exists)
    }

    public static List<String> listPackages(Map<String, Set<String>> registry) {
        // TODO: Return a list of all package IDs
       
    }

    public static Set<String> getAllDestinations(Map<String, Set<String>> registry) {
        // TODO: Return all unique destinations from the registry
       
    }

    public static void printRegistry(Map<String, Set<String>> registry) {
        // TODO: Print each package ID and its destinations
    }

    public static void removePackage(Map<String, Set<String>> registry, String packageId) {
        // TODO: Remove the package from the registry
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    /*
    public static void main(String[] args) {
        Map<String, Set<String>> registry = createShippingRegistry();
        registerPackage(registry, "PKG001", Set.of("Madrid", "Barcelona"));
        registerPackage(registry, "PKG002", Set.of("Valencia"));
        addDestination(registry, "PKG002", "Sevilla");
        addDestination(registry, "PKG002", "Valencia"); // Ignored

        System.out.println(listPackages(registry));          // [PKG001, PKG002]
        System.out.println(getAllDestinations(registry));    // [Madrid, Barcelona, Valencia, Sevilla]
        printRegistry(registry);

        removePackage(registry, "PKG001");
        printRegistry(registry);
    }
    */
	// Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
	// -------------------------------------------------------------
}