package io.turntabl;

//exception class to handle invalid client
//ids in getClientNameById method in ClientRegister
public class InvalidClientIdException extends Exception {

    public InvalidClientIdException(String errorMessage) {
        super(errorMessage);
    }

    public InvalidClientIdException() {
        super();
    }
}
