package Exemplo;


public class FabricaFuncionario {

	public static final String[] nomes = { "João", "MAria", "Pedro", "Camila" };

	public static Funcionario getFuncionario(String nome) {

		for (int i = 0; i < nomes.length; i++) {

			if (nomes[i].equalsIgnoreCase(nome)) {
				return new Programador(nome);
			}

		}
		return new FuncionarioNulo();
	}
}
