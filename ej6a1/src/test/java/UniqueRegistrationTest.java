import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueRegistrationTest {

    @Test
    public void testRegisterParticipants_orderAndNoDuplicates() {
        UniqueRegistration reg = new UniqueRegistration();

        String[] data = {
            "ana@example.com", "carla@example.com", "ana@example.com", "jose@example.com"
        };
        reg.registerParticipants(data);
        Set<String> result = reg.getRegistered();

        List<String> expected = List.of("ana@example.com", "carla@example.com", "jose@example.com");
        assertEquals(3, result.size());
        assertIterableEquals(expected, new ArrayList<>(result));
    }

    @Test
    public void testGenerateAlphabeticalList_sortedOrder() {
        UniqueRegistration reg = new UniqueRegistration();
        reg.registerParticipants(new String[]{
            "carla@example.com", "ana@example.com", "jose@example.com"
        });

        List<String> result = reg.generateAlphabeticalList();
        List<String> expected = List.of("ana@example.com", "carla@example.com", "jose@example.com");

        assertEquals(expected, result);
    }

    @Test
    public void testCheckRegistrations_onlyMatchingOnes() {
        UniqueRegistration reg = new UniqueRegistration();
        reg.registerParticipants(new String[]{
            "ana@example.com", "carla@example.com", "jose@example.com"
        });

        String[] toCheck = {"jose@example.com", "laura@example.com"};
        List<String> result = reg.checkRegistrations(toCheck);

        List<String> expected = List.of("jose@example.com");
        assertEquals(expected, result);
    }

    @Test
    public void testRegisterParticipants_emptyInput() {
        UniqueRegistration reg = new UniqueRegistration();
        reg.registerParticipants(new String[]{});

        assertTrue(reg.getRegistered().isEmpty());
    }

    @Test
    public void testCheckRegistrations_allUnregistered() {
        UniqueRegistration reg = new UniqueRegistration();
        reg.registerParticipants(new String[]{"ana@example.com", "carla@example.com"});

        String[] toCheck = {"pepe@example.com", "luis@example.com"};
        List<String> result = reg.checkRegistrations(toCheck);

        assertTrue(result.isEmpty());
    }
}
