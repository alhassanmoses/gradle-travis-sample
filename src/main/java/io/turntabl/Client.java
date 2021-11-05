package io.turntabl;

public abstract class Client {

    // ******************** Properties ******************** //
    private String clientFName;
    private String clientOName;
    private long clientId;
    private ServiceLevel clientServiceLevel;

    // ******************** Constructors ******************** //

    public Client(String clientFName, String clientOName, long clientId, ServiceLevel clientServiceLevel) {
        this.clientFName = clientFName;
        this.clientOName = clientOName;
        this.clientId = clientId;
        this.clientServiceLevel = clientServiceLevel;
    }

    // ******************** Getters and Setters ******************** //

    public String getClientFName() {
        return clientFName;
    }

    public String getClientOName() {
        return clientOName;
    }

    public long getClientId() {
        return clientId;
    }

    public ServiceLevel getClientServiceLevel() {
        return clientServiceLevel;
    }

    // ******************** Methods ******************** //

    public String getContactName() {
        return clientFName + " " + clientOName;
    }

}
