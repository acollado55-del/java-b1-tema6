import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradeBookManagerTest {

    @Test
    public void testAddScoreAndGetAverage() {
        GradeBookManager gb = new GradeBookManager();
        gb.addScore("Alice", 90);
        gb.addScore("Alice", 85);

        // Check valid average
        assertEquals(87.5, gb.getAverage("Alice"), 0.01);

        // Check average for non-existing student
        assertEquals(-1, gb.getAverage("Bob"), 0.01);

        // Add student with a score of 0 and check average
        gb.addScore("Bob", 0);
        assertEquals(0.0, gb.getAverage("Bob"), 0.01);
    }

    @Test
    public void testRemoveStudent() {
        GradeBookManager gb = new GradeBookManager();
        gb.addScore("Alice", 90);
        gb.addScore("Bob", 80);
        gb.removeStudent("Bob");

        // Check Bob's average returns -1 (removed)
        assertEquals(-1, gb.getAverage("Bob"), 0.01);

        // Alice should still exist
        assertEquals(90, gb.getAverage("Alice"), 0.01);
    }

    @Test
    public void testPrintGradeBookOutput() {
        GradeBookManager gb = new GradeBookManager();
        gb.addScore("Carlos", 92);
        gb.addScore("Alice", 90);
        gb.addScore("Alice", 85);
        gb.addScore("Bob", 75);

        String expected = String.join(System.lineSeparator(),
            "Alice -> [90, 85]",
            "Bob -> [75]",
            "Carlos -> [92]"
        ) + System.lineSeparator();

        // Capture System.out
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        gb.printGradeBook();

        // Validate printed output
        assertEquals(expected, outContent.toString());

        // Reset System.out
        System.setOut(System.out);
    }
}
