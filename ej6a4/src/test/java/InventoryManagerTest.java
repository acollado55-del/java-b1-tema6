import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryManagerTest {

    @Test
    public void testAddAndGetStock() {
        Map<String, Integer> inventory = InventoryManager.createInventory();
        InventoryManager.addProduct(inventory, "Mouse", 10);
        InventoryManager.addProduct(inventory, "Mouse", 5);
        InventoryManager.addProduct(inventory, "Keyboard", 3);

        assertEquals(15, InventoryManager.getStock(inventory, "Mouse"));
        assertEquals(3, InventoryManager.getStock(inventory, "Keyboard"));
        assertEquals(0, InventoryManager.getStock(inventory, "Monitor")); // not present
    }

    @Test
    public void testUpdateStock() {
        Map<String, Integer> inventory = InventoryManager.createInventory();
        InventoryManager.addProduct(inventory, "Mouse", 10);
        InventoryManager.updateStock(inventory, "Mouse", 4);
        InventoryManager.updateStock(inventory, "Keyboard", 2); // does not exist

        assertEquals(4, InventoryManager.getStock(inventory, "Mouse"));
        assertEquals(0, InventoryManager.getStock(inventory, "Keyboard"));
    }

    @Test
    public void testRemoveZeroStock() {
        Map<String, Integer> inventory = InventoryManager.createInventory();
        InventoryManager.addProduct(inventory, "Mouse", 10);
        InventoryManager.addProduct(inventory, "Keyboard", 0);
        InventoryManager.addProduct(inventory, "Monitor", 5);
        InventoryManager.addProduct(inventory, "Speaker", 0);

        InventoryManager.removeZeroStock(inventory);

        assertEquals(2, inventory.size());
        assertTrue(inventory.containsKey("Mouse"));
        assertTrue(inventory.containsKey("Monitor"));
        assertFalse(inventory.containsKey("Keyboard"));
        assertFalse(inventory.containsKey("Speaker"));
    }

    @Test
    public void testPrintInventoryOutput() {
        Map<String, Integer> inventory = InventoryManager.createInventory();
        InventoryManager.addProduct(inventory, "Mouse", 1);
        InventoryManager.addProduct(inventory, "Keyboard", 2);

        // Captura de salida estándar
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        InventoryManager.printInventory(inventory);

        String output = out.toString().trim();
        assertTrue(output.contains("Mouse"));
        assertTrue(output.contains("Keyboard"));
        assertTrue(output.contains("1"));
        assertTrue(output.contains("2"));
    }
}
