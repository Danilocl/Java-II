package Exemplo;

/**
 * Projeto implementando o design pattern "nullobject" 
 * @author 36115142016.2N
 *
 */

public class TesteNull {

	public static void main(String[] args) {
		
		Funcionario func1 = FabricaFuncionario.getFuncionario("Danilo");
		System.out.println(func1.getNome());
		
		Funcionario func2 = FabricaFuncionario.getFuncionario("Maria");
		System.out.println(func2.getNome());
	}
}
