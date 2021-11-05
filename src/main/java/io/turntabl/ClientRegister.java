package io.turntabl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClientRegister {

    // ******************** Properties ******************** //

    private List<Client> allClients;


    // ******************** Constructors ******************** //

    public ClientRegister(List<Client> allClients) {
        this.allClients = allClients;
    }

    public ClientRegister() {
        allClients = new ArrayList<>();
    }

    // ******************** Getters and Setters ******************** //

    public List<Client> getAllClients() {
        return List.copyOf(allClients);
    }

    public void setAllClients(List<Client> allClients) {
        this.allClients = allClients;
    }

    // ******************** Methods ******************** //

    //adding a new client to your clients register
    public void addClient(Client client) {
        allClients.add(client);
    }

    //adding multiple clients to your register
    public void addClients(List<Client> clients) {
        allClients.addAll(clients);
    }

    public List<Client> getGoldClientsContacts() {

        return allClients.stream().filter(cli -> cli.getClientServiceLevel() == ServiceLevel.Gold).collect(Collectors.toList());

    }

    public String getClientNameById(long clientId) throws InvalidClientIdException {
        var clientById = allClients.stream().filter(cli -> cli.getClientId() == clientId).findFirst();

        //throwing a custom exception should no user with the specified id exist
        if (clientById.isPresent()) {

            return clientById.get().getContactName();

        } else {

            throw new InvalidClientIdException("Invalid client Id specified, use a valid client Id");

        }

    }

}
