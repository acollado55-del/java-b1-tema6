import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ShippingRegistryTest {

    private Map<String, Set<String>> registry;

    @BeforeEach
    void setUp() {
        registry = ShippingRegistry.createShippingRegistry();
    }

    @Test
    void testRegisterAndListPackages() {
        ShippingRegistry.registerPackage(registry, "PKG001", Set.of("Madrid", "Barcelona"));
        ShippingRegistry.registerPackage(registry, "PKG002", Set.of("Valencia"));

        List<String> packages = ShippingRegistry.listPackages(registry);
        assertEquals(List.of("PKG001", "PKG002"), packages);
    }

    @Test
    void testAddDestination() {
        ShippingRegistry.registerPackage(registry, "PKG002", new HashSet<>(Set.of("Valencia")));
        ShippingRegistry.addDestination(registry, "PKG002", "Sevilla");

        Set<String> destinations = registry.get("PKG002");
        assertTrue(destinations.contains("Valencia"));
        assertTrue(destinations.contains("Sevilla"));
    }

    @Test
    void testGetAllDestinations() {
        ShippingRegistry.registerPackage(registry, "PKG001", Set.of("Madrid", "Barcelona"));
        ShippingRegistry.registerPackage(registry, "PKG002", Set.of("Valencia", "Sevilla"));

        Set<String> all = ShippingRegistry.getAllDestinations(registry);
        assertTrue(all.contains("Madrid"));
        assertTrue(all.contains("Barcelona"));
        assertTrue(all.contains("Valencia"));
        assertTrue(all.contains("Sevilla"));
        assertEquals(4, all.size());
    }

    @Test
    void testRemovePackage() {
        ShippingRegistry.registerPackage(registry, "PKG001", Set.of("Madrid", "Barcelona"));
        ShippingRegistry.removePackage(registry, "PKG001");

        assertFalse(registry.containsKey("PKG001"));
    }

    @Test
    void testPrintRegistry() {
        ShippingRegistry.registerPackage(registry, "PKG001", new HashSet<>(Set.of("Madrid", "Barcelona")));
        ShippingRegistry.registerPackage(registry, "PKG002", new HashSet<>(Set.of("Valencia", "Sevilla")));

        // Redirect System.out
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        ShippingRegistry.printRegistry(registry);

        String output = outContent.toString().trim();
        assertTrue(output.contains("PKG001 ->"), "Should contain PKG001");
        assertTrue(output.contains("PKG002 ->"), "Should contain PKG002");
        assertTrue(output.contains("Madrid"), "Should contain Madrid");
        assertTrue(output.contains("Barcelona"), "Should contain Barcelona");
        assertTrue(output.contains("Valencia"), "Should contain Valencia");
        assertTrue(output.contains("Sevilla"), "Should contain Sevilla");
    }
}
