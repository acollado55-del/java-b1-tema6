import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicketQueueManagerTest {

    TicketQueueManager manager;

    @BeforeEach
    public void setup() {
        manager = new TicketQueueManager();
        manager.addTicket("Software issue");
        manager.addTicket("Network error");
        manager.addTicket("Printer not working");
    }

    @Test
    public void testNextTicket() {
        assertEquals("Software issue", manager.getNextTicket());
    }

    @Test
    public void testProcessTicket() {
        manager.processTicket();
        assertEquals("Network error", manager.getNextTicket());
    }

    @Test
    public void testIsTicketPresent() {
        assertTrue(manager.isTicketPresent("Printer not working"));
        assertFalse(manager.isTicketPresent("Unknown"));
    }

    @Test
    public void testPrintAllTickets() {
        // Capture System.out output
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        java.io.PrintStream originalOut = System.out;
        System.setOut(new java.io.PrintStream(out));

        manager.printAllTickets();

        System.setOut(originalOut);
        String output = out.toString().trim();

        assertTrue(output.contains("Software issue"));
        assertTrue(output.contains("Network error"));
        assertTrue(output.contains("Printer not working"));
    }
}
