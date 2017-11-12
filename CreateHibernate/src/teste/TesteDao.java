package teste;

import model.Client;
import model.dao.ClientDao;

public class TesteDao {

	public static void main(String[] args) {

		ClientDao dao = ClientDao.getInstancia();

		// Client client = new Client();

		// client.setNome("Danilo Cardoso");
		// client.setEndereco("Rua das Flores, 10");
		// client.setTelefone("21 22222-99999");
		//
		// dao.persistir(client);

		 Client jose = dao.buscaporId(1);
		
		 System.out.println(jose.getNome() + "\n" + jose.getTelefone());
		
		 jose.setNome("José da Silva Pacheco");
		
		 dao.update(jose);
		
		 System.out.println(jose.getNome());

		// for (int i = 4; i <= 05; i++) {
		// dao.removePorId(i);
		// }

	}
}
