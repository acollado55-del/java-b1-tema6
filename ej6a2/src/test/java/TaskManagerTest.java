import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void testAddAndReviewTasks() {
        List<String> tasks = TaskManager.createTaskList();
        TaskManager.addTask(tasks, "Write report");
        TaskManager.addUrgentTask(tasks, "Fix critical bug");
        TaskManager.addTask(tasks, "Prepare slides");

        assertEquals(List.of("Fix critical bug", "Write report", "Prepare slides"), tasks);
    }

    @Test
    public void testMergeTaskLists() {
        List<String> list1 = TaskManager.createTaskList();
        TaskManager.addTask(list1, "Task A");
        List<String> list2 = TaskManager.createTaskList();
        TaskManager.addTask(list2, "Task B");
        TaskManager.addTask(list2, "Task C");

        TaskManager.mergeTaskLists(list1, list2);

        assertEquals(List.of("Task A", "Task B", "Task C"), list1);
    }

    @Test
    public void testMarkCompleted() {
        List<String> tasks = TaskManager.createTaskList();
        TaskManager.addTask(tasks, "Task 1");
        TaskManager.addTask(tasks, "Task 2");
        TaskManager.addTask(tasks, "Task 3");

        Set<String> completed = Set.of("Task 2");
        TaskManager.markCompleted(tasks, completed);

        assertEquals(List.of("Task 1", "Task 3"), tasks);
    }

    @Test
    public void testUpdateTask() {
        List<String> tasks = TaskManager.createTaskList();
        TaskManager.addTask(tasks, "Old task");
        TaskManager.updateTask(tasks, "Old task", "New task");

        assertTrue(tasks.contains("New task"));
        assertFalse(tasks.contains("Old task"));
    }

    @Test
    public void testReviewTasksOutput() {
        List<String> tasks = TaskManager.createTaskList();
        TaskManager.addTask(tasks, "Check logs");
        TaskManager.addTask(tasks, "Review PR");

        // Captura de salida estándar
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TaskManager.reviewTasks(tasks);

        System.setOut(originalOut);
        String output = outContent.toString().trim();

        assertTrue(output.contains("Check logs"));
        assertTrue(output.contains("Review PR"));
    }
}
