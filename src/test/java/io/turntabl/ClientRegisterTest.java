package io.turntabl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}