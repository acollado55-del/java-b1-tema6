import java.util.*;

/**
 * Sistema de gestión de incidencias por cola (FIFO)
 * --------------------------------------------------
 * Una empresa de soporte técnico necesita un sistema para gestionar incidencias
 * de los usuarios. Cada incidencia se encola en el orden en que se recibe,
 * siguiendo una política FIFO (First-In, First-Out).
 *
 * El sistema debe permitir:
 *  - Añadir incidencias a la cola.
 *  - Obtener y eliminar la incidencia que se debe atender.
 *  - Consultar la siguiente incidencia sin eliminarla.
 *  - Listar todas las incidencias pendientes.
 *  - Verificar si una incidencia concreta está en la cola.
 *
 * Para ello, se encapsula la cola dentro de una clase, de modo que todas las operaciones
 * se realicen sobre su estado interno. Esto facilita el mantenimiento del código
 * y permite respetar el principio de encapsulamiento de la programación orientada a objetos.
 *
 * MÉTODOS A IMPLEMENTAR:
 * -----------------------
 * - void addTicket(String ticket)
 *     -> Añade una incidencia a la cola.
 *
 * - String getNextTicket()
 *     -> Devuelve la próxima incidencia sin eliminarla.
 *
 * - void processTicket()
 *     -> Atiende y elimina la siguiente incidencia.
 *
 * - void printAllTickets()
 *     -> Imprime todas las incidencias pendientes sin modificar la cola.
 *
 * - boolean isTicketPresent(String ticket)
 *     -> Comprueba si una incidencia está en la cola.
 *
 * EJEMPLO:
 * --------
 * TicketQueueManager manager = new TicketQueueManager();
 * manager.addTicket("Software issue");
 * manager.addTicket("Network error");
 * manager.addTicket("Printer not working");
 *
 * System.out.println(manager.getNextTicket());   // Software issue
 *
 * manager.processTicket();
 *
 * manager.printAllTickets();
 *
 * System.out.println(manager.isTicketPresent("Printer not working")); // true
 *
 * // Salida esperada:
 * // Software issue
 * //
 * // Network error
 * // Printer not working
 * //
 * // true
 *
 * ---
 *
 * Sistema de gestió d'incidències per cua (FIFO)
 * -----------------------------------------------
 * Una empresa de suport tècnic necessita un sistema per gestionar incidències
 * dels usuaris. Cada incidència s'encua segons l'ordre de recepció,
 * seguint una política FIFO (First-In, First-Out).
 *
 * El sistema ha de permetre:
 *  - Afegir incidències a la cua.
 *  - Obtenir i eliminar la incidència que s'ha d'atendre.
 *  - Consultar la següent incidència sense eliminar-la.
 *  - Llistar totes les incidències pendents.
 *  - Verificar si una incidència concreta és a la cua.
 *
 * Per això, s'encapsula la cua dins d'una classe, de manera que totes les operacions
 * es facin sobre el seu estat intern. Això en facilita el manteniment i respecta
 * el principi d'encapsulament de la programació orientada a objectes.
 *
 * MÈTODES A IMPLEMENTAR:
 * -----------------------
 * - void addTicket(String ticket)
 *     -> Afegeix una incidència a la cua.
 *
 * - String getNextTicket()
 *     -> Retorna la pròxima incidència sense eliminar-la.
 *
 * - void processTicket()
 *     -> Atén i elimina la següent incidència.
 *
 * - void printAllTickets()
 *     -> Imprimeix totes les incidències pendents sense modificar la cua.
 *
 * - boolean isTicketPresent(String ticket)
 *     -> Comprova si una incidència és a la cua.
 *
 * EXEMPLE:
 * --------
 * TicketQueueManager manager = new TicketQueueManager();
 * manager.addTicket("Software issue");
 * manager.addTicket("Network error");
 * manager.addTicket("Printer not working");
 *
 * System.out.println(manager.getNextTicket());   // Software issue
 *
 * manager.processTicket();
 *
 * manager.printAllTickets();
 *
 * System.out.println(manager.isTicketPresent("Printer not working")); // true
 *
 * // Sortida esperada:
 * // Software issue
 * //
 * // Network error
 * // Printer not working
 * //
 * // true
 */

public class TicketQueueManager {

    private Queue<String> ticketQueue;

    public TicketQueueManager() {
        this.ticketQueue = new LinkedList<>();
    }

    public void addTicket(String ticket) {
        // TODO: Add the ticket to the queue.
        ticketQueue.add(ticket);
    
    }

    public String getNextTicket() {
        // TODO: Return the first ticket in the queue without removing it.
        if (!ticketQueue.isEmpty()) {
            return ticketQueue.peek();
        }
        return null;
        
    }

    public void processTicket() {
        // TODO: Remove and process the first ticket in the queue.
        if (!ticketQueue.isEmpty()) {
            ticketQueue.poll();
        }

    }

    public void printAllTickets() {
        // TODO: Print all tickets currently in the queue, one per line.
        for (String ticket : ticketQueue) {
            System.out.println(ticket);
        }

    }

    public boolean isTicketPresent(String ticket) {
        // TODO: Return true if the ticket is in the queue; false otherwise.
        return ticketQueue.contains(ticket);
       
    }

    // -------------------------------------------------------------
    // Manual test using IDE
    // -------------------------------------------------------------
    
    public static void main(String[] args) {
        TicketQueueManager manager = new TicketQueueManager();
        manager.addTicket("Software issue");
        manager.addTicket("Network error");
        manager.addTicket("Printer not working");

        System.out.println(manager.getNextTicket());   // Software issue

        manager.processTicket();

        manager.printAllTickets();

        System.out.println(manager.isTicketPresent("Printer not working")); // true
    }
    
    // Torna a comentar aquest main quan vulguis executar els tests amb maven test
    // Vuelve a comentar este main cuando quieras ejecutar los tests con:
    // mvn test
    // -------------------------------------------------------------
}
