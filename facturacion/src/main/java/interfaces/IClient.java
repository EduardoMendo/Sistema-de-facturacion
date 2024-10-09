package interfaces;

import models.Client;

import java.util.List;

public interface IClient {

    public void save(Client client);
    public Client getClient(int id);
    public void UpdateClient(Client client);
    public void delete(Client client);
    public List<Client> getAllClient();




}
