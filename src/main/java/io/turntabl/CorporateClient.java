package io.turntabl;

public class CorporateClient extends Client {

    // ******************** Properties ******************** //

    //Assuming each corporate account will later have more logic related to their account manager
    //hence an AccountManager object will be optimal for future scalability
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
