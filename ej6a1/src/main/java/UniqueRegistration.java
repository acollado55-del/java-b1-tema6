import java.util.*;

/**
 * Registro de usuarios para un evento
 * ------------------------------------
 * Una organización está preparando un evento tecnológico y necesita gestionar el registro
 * de los participantes de forma que:
 *
 * 1. No se repitan usuarios con el mismo correo.
 * 2. Puedan consultar la lista de registros en el orden en que se han inscrito.
 * 3. Puedan generar un listado alfabético con todos los correos registrados para enviarlo por email.
 * 4. Se puedan buscar fácilmente usuarios a partir de una lista y se indique si ya están inscritos.
 *
 * Para ello, se decide encapsular la lista de participantes en una clase, de forma que las operaciones de registro,
 * consulta y verificación se realicen a través de métodos que acceden al estado interno. Esto permite una mejor organización,
 * facilita el mantenimiento y respeta el principio de encapsulamiento de la programación orientada a objetos.
 *
 * MÉTODOS A IMPLEMENTAR:
 * -----------------------
 * - void registerParticipants(String[] entries)
 *     -> Registra los participantes sin duplicados y en el mismo orden en que se registraron.
 *
 * - List<String> generateAlphabeticalList()
 *     -> Devuelve una lista ordenada alfabéticamente con los correos registrados.
 *
 * - List<String> checkRegistrations(String[] toCheck)
 *     -> Recibe una lista de correos y devuelve una sublista con los que ya están registrados.
 *
 * EJEMPLO:
 * --------
 * ENTRADA:
 *   String[] rawData = {
 *       "ana@example.com", "carla@example.com", "ana@example.com", "jose@example.com"
 *   };
 *   UniqueRegistration reg = new UniqueRegistration();
 *   reg.registerParticipants(rawData);
 *   System.out.println(reg.getRegistered()); // orden de registro
 *
 *   List<String> sorted = reg.generateAlphabeticalList();
 *   System.out.println(sorted); // orden alfabético
 *
 *   String[] checkList = {
 *       "jose@example.com", "laura@example.com"
 *   };
 *   List<String> found = reg.checkRegistrations(checkList);
 *   System.out.println(found); // ya registrados
 *
 * SALIDA:
 *   [ana@example.com, carla@example.com, jose@example.com]
 *   [ana@example.com, carla@example.com, jose@example.com]
 *   [jose@example.com]
 *
 * ---
 *
 * Registre d'usuaris per a un esdeveniment
 * -----------------------------------------
 * Una organització està preparant un esdeveniment tecnològic i necessita gestionar el registre
 * dels participants de manera que:
 *
 * 1. No es repeteixin usuaris amb el mateix correu.
 * 2. Es pugui consultar la llista en l'ordre en què es van inscriure.
 * 3. Es pugui generar un llistat alfabètic amb tots els correus registrats per enviar-lo.
 * 4. Es pugui comprovar si una llista de correus ja s'ha registrat.
 *
 * Per això, es decideix encapsular la llista de participants en una classe, de manera que les operacions de registre,
 * consulta i verificació es facin a través de mètodes que accedeixen a l’estat intern. Això permet una millor organització,
 * en facilita el manteniment i respecta el principi d’encapsulament de la programació orientada a objectes.
 *
 * MÈTODES A IMPLEMENTAR:
 * -----------------------
 * - void registerParticipants(String[] entries)
 *     -> Registra els participants sense duplicats i en el mateix ordre en què es van inscriure.
 *
 * - List<String> generateAlphabeticalList()
 *     -> Retorna una llista ordenada alfabèticament amb els correus registrats.
 *
 * - List<String> checkRegistrations(String[] toCheck)
 *     -> Rep una llista de correus i retorna els que ja estan registrats.
 *
 * EXEMPLE:
 * ---------
 * ENTRADA:
 *   String[] rawData = {
 *       "ana@example.com", "carla@example.com", "ana@example.com", "jose@example.com"
 *   };
 *   UniqueRegistration reg = new UniqueRegistration();
 *   reg.registerParticipants(rawData);
 *   System.out.println(reg.getRegistered()); // ordre de registre
 *
 *   List<String> sorted = reg.generateAlphabeticalList();
 *   System.out.println(sorted); // ordre alfabètic
 *
 *   String[] checkList = {
 *       "jose@example.com", "laura@example.com"
 *   };
 *   List<String> found = reg.checkRegistrations(checkList);
 *   System.out.println(found); // ja registrats
 *
 * SORTIDA:
 *   [ana@example.com, carla@example.com, jose@example.com]
 *   [ana@example.com, carla@example.com, jose@example.com]
 *   [jose@example.com]
 */

public class UniqueRegistration {

    private Set<String> registered;

    public UniqueRegistration() {
        registered = new LinkedHashSet<>();
    }

    public void registerParticipants(String[] entries) {
        // TODO: Register emails without duplicates, maintaining original order.
    }

    public List<String> generateAlphabeticalList() {
        // TODO: Return a list of registered emails in alphabetical order.
        return null;
    }

    public List<String> checkRegistrations(String[] toCheck) {
        // TODO: Return a list of emails from toCheck that are already registered.
        return null;
    }

    public Set<String> getRegistered() {
        return new LinkedHashSet<>(registered);
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    /*
    public static void main(String[] args) {
        UniqueRegistration reg = new UniqueRegistration();

        String[] rawData = {
            "ana@example.com", "carla@example.com", "ana@example.com", "jose@example.com"
        };
        reg.registerParticipants(rawData);
        System.out.println("== Registration Order ==");
        System.out.println(reg.getRegistered());

        List<String> sorted = reg.generateAlphabeticalList();
        System.out.println("\n== Alphabetical Order ==");
        System.out.println(sorted);

        String[] checkList = {
            "jose@example.com", "laura@example.com"
        };
        List<String> found = reg.checkRegistrations(checkList);
        System.out.println("\n== Already Registered ==");
        System.out.println(found);
    }
    */
    // Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
    // -------------------------------------------------------------
}
