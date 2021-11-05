package io.turntabl;

//Manager class for Corporate accounts
public class AccountManager implements Manager {

    // ******************** Properties ******************** //

    private String acmFName;
    private String acmOName;

    // ******************** Constructors ******************** //

    public AccountManager(String acmFName, String acmOName) {
        this.acmFName = acmFName;
        this.acmOName = acmOName;
    }

    // ******************** Overrides ******************** //

    @Override
    public String getManagerName() {
        return acmFName + " " + acmOName;
    }

    @Override
    public String toString() {
        return "AccountManager{" +
                "acmFName='" + acmFName + '\'' +
                ", acmOName='" + acmOName + '\'' +
                '}';
    }
}
