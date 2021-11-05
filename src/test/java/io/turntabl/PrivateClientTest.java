package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrivateClientTest {

    @Test
    void getContactName() {
        Client client = new PrivateClient("Moses", "Wuniche", 1, ServiceLevel.Premium);

        String contactName = client.getContactName();
        System.out.println("**********************************************");
        assertEquals("Moses Wuniche", contactName);
    }

}