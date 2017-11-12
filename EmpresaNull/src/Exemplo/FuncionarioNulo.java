package Exemplo;

public class FuncionarioNulo extends Funcionario {

	@Override
	public boolean eNulo() {

		return true;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "Funcionario não existente";
	}

}
