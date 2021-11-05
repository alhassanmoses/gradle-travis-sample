package io.turntabl;

public class CorporateClient extends Client {

    // ******************** Properties ******************** //

    private AccountManager accountManager;

    // ******************** Constructors ******************** //

    public CorporateClient(String clientFName, String clientOName, long clientId, ServiceLevel clientServiceLevel, AccountManager accountManager) {
        super(clientFName, clientOName, clientId, clientServiceLevel);
        this.accountManager = accountManager;

    }

    // ******************** Overrides ******************** //

    @Override
    public String getContactName() {
        return accountManager.getManagerName();
    }

}
