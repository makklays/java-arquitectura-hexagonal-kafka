package com.techmatrix18.domain.model;

import org.junit.jupiter.api.Test;
import java.util.Set;
import java.util.UUID;
import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    @Test
    void shouldCreateClientWithRequiredFields() {
        UUID id = UUID.randomUUID();
        String email = "test@techmatrix18.com";
        String phone = "+123456789";

        Client client = new Client(
                id,
                "John",
                "Connor",
                email,
                phone,
                "ООО Terminator",
                null,
                null,
                "site",
                Set.of("new", "important")
        );

        assertEquals(id, client.getId());
        assertEquals("John", client.getFirstName());
        assertEquals("Connor", client.getLastName());
        assertEquals(email, client.getEmail());
        assertEquals(ClientType.POTENTIAL, client.getType()); // по умолчанию
        assertNotNull(client.getRegisteredAt());
    }

    /*@Test
    void shouldPromoteClientToActive() {
        Client client = TestDataFactory.defaultClient();
        client.promoteToActive();
        assertEquals(ClientType.ACTIVE, client.getType());
    }*/
}

