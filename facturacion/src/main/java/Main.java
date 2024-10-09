import dao.ClientDao;
import models.Client;

public class Main {
    public static void main(String[] args) {
        ClientDao daoClient = new ClientDao();
        Client client = new Client();

        client.setFullName("Eduardo Francisco Mendoza Blandon");
        client.setId(2202L);
        client.setEmail("Eduardo@gamil.com");
        client.setPhone("8805 9962");
        client.setDate("14/05/2023");
        daoClient.save(client);

    }
}
