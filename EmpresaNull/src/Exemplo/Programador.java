package Exemplo;

public class Programador extends Funcionario {
	
	public Programador(String nome) {
		this.nome = nome;
	}

	@Override
	public boolean eNulo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}
	
	

	
}
