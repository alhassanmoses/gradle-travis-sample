package io.turntabl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountManagerTest {

    @Test
    void getManagerName() {
        Client client = new CorporateClient("Moses", "Wuniche", 1, ServiceLevel.Premium, new AccountManager("John", "Doe"));

        String contactName = client.getContactName();
        System.out.println("**********************************************");
        assertEquals("John Doe", contactName);
    }
}