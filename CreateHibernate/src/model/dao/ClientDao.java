package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Client;
	
public class ClientDao {
	
	private static ClientDao instancia;
	private EntityManager entityManager;
	
	private ClientDao() {
		entityManager = getEntityManager();
	}
	
	public static ClientDao getInstancia() {
		
		if (instancia == null) {
			instancia = new ClientDao();
			return instancia;
		} else {
			return instancia;
		}
		
	}
	
	private EntityManager getEntityManager() {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastrodb");
		
		if (entityManager == null) {
			entityManager = factory.createEntityManager();
		}
			
		return entityManager;
	}
	
	public Client buscaporId(int id) {
		
		return entityManager.find(Client.class, id);
		
	}
	
	@SuppressWarnings("unchecked") 
	public List<Client> buscarTodos() {
		
		return entityManager.createQuery("FROM " + Client.class.getName()).getResultList();
	}
	
	public void persistir(Client c) {
		
		entityManager.getTransaction().begin();
		entityManager.persist(c);
		entityManager.getTransaction().commit();
		
	}
	
	public void update(Client c) {
		
		entityManager.getTransaction().begin();
		entityManager.merge(c);
		entityManager.getTransaction().commit();
	}
	
	public void remove(Client c) {
		
		entityManager.getTransaction().begin();
		c = entityManager.find(Client.class,c.getId());
		entityManager.remove(c);
		entityManager.getTransaction().commit();
	}
	
	public void removePorId(int id) {
		
		Client c = buscaporId(id);
		remove(c);
	}
	
	
	
	
	
	
	
	
	
	
	
}	
	