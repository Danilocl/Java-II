package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Client;

public class TestHibernate {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cadastrodb");

		EntityManager manager = factory.createEntityManager();

		Client client = new Client();

		client.setNome("Jamilton damasceno");
		client.setTelefone("(21) 412511-45");
		client.setEndereco("Rua Santa Luzia 75 ");
				
		
		manager.getTransaction().begin();

		manager.persist(client);

		manager.getTransaction().commit();

		manager.close();

	}
}
