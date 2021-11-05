package io.turntabl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ClientRegisterTest {

    Client misty;
    ClientRegister theRegister;

    @BeforeEach
    void setup() {
        misty = new PrivateClient("Moses", "Wuniche", 2, ServiceLevel.Premium);
        theRegister = new ClientRegister();
    }

    @Test
    void addClient() {


        theRegister.addClient(misty);

        assertTrue(theRegister.getAllClients().contains(misty));

    }

    @Test
    void getClientNameByIdThrowsException() throws InvalidClientIdException {


        theRegister.addClient(misty);

        assertThrows(InvalidClientIdException.class, () -> theRegister.getClientNameById(4));

    }

    @Test
    void getClientNameById() {

        theRegister.addClient(misty);

        try {
            assertEquals(misty.getContactName(), theRegister.getClientNameById(2));

        } catch (InvalidClientIdException e) {
            e.printStackTrace();
        }
    }

    @Test
    void getClientsInsights() {

        var clientsList = List.of(new PrivateClient("Moses", "Wuniche", 2, ServiceLevel.Premium),
                new PrivateClient("Moses", "Wuniche", 2, ServiceLevel.Premium),
                new PrivateClient("Selasi", "Randy", 2, ServiceLevel.Gold),
                new PrivateClient("Priscella", "Odame", 2, ServiceLevel.Platinum),
                new PrivateClient("Philip", "Afriye", 2, ServiceLevel.Premium),
                new PrivateClient("Peter", "Turkson", 2, ServiceLevel.Gold),
                new CorporateClient("John", "Doe", 1, ServiceLevel.Gold, new AccountManager("Moses", "Alhassan")),
                new CorporateClient("Jane", "Doe", 1, ServiceLevel.Platinum, new AccountManager("Wuniche", "Moses")),
                new CorporateClient("Kenny", "Rogers", 1, ServiceLevel.Premium, new AccountManager("Misty", "Me")),
                new CorporateClient("Maise", "Peter", 1, ServiceLevel.Premium, new AccountManager("Ellie", "Goldlin")),
                new CorporateClient("Madona", "Madona", 1, ServiceLevel.Gold, new AccountManager("James", "Doe")),
                new CorporateClient("Dolly", "Patern", 1, ServiceLevel.Gold, new AccountManager("Jane", "Doe")));

        ClientRegister clientsRegister = new ClientRegister(clientsList);

        Map<ServiceLevel, Long> clientsInsights = clientsRegister.getClientsInsights();

        //All assertions must pass together
        assertEquals(5, clientsInsights.get(ServiceLevel.Gold));

        assertEquals(5, clientsInsights.get(ServiceLevel.Premium));

        assertEquals(2, clientsInsights.get(ServiceLevel.Platinum));

    }

}