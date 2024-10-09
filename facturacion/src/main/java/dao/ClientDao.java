package dao;

import interfaces.IClient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import models.Client;

import java.util.List;

public class ClientDao implements IClient {
    @Override
    public void save(Client client) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(client);
        em.getTransaction().commit();
    }

    @Override
    public void UpdateClient(Client client) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(client);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Client client) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.remove(client);
        em.getTransaction().commit();
    }

    @Override
    public List<Client> getAllClient() {
        EntityManager em = EntityManagerAdmin.getInstance();
        Query query = em.createQuery("SELECT c FROM Client c");
        return query.getResultList();
    }





}
