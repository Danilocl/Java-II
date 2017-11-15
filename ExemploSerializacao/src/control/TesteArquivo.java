package control;

import java.io.Serializable;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import model.Cliente;
import model.ManipulaArquivo;

public class TesteArquivo {

	static final Logger logger = LogManager.getLogger(TesteArquivo.class.getName());

	public static void main(String[] args) {

		String caminho = "C:/serializacao/teste.doc";

		logger.info("iniciando a aplicação");
		
		logger.trace("chamndo o método deserializa");
		
		
		
		// Cliente cliente = new Cliente();
		//
		// cliente.setNome("Danilo");
		// cliente.setEmail("teste@gmail.com");
		// cliente.setCpf("123456789101");
		// cliente.setId(01);
		//
		// ManipulaArquivo.serializa(cliente, caminho);

		// ManipulaArquivo.deserializa(caminho);

		// Cliente recuperar = (Cliente) ManipulaArquivo.deserializa(caminho);
		//
		// System.out.println(recuperar.getNome() + " " + recuperar.getCpf() + "
		// " + " " + recuperar.getEmail());

	}
}
