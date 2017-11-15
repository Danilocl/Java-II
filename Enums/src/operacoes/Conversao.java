package operacoes;

public class Conversao {

	public static void main(String[] args) {

		try {

			Operation op = Operation.valueOf("divisao".toLowerCase());

			System.out.println(op.calculo(100, 10));

		} catch (IllegalArgumentException e) {
			System.out.println("Cálculo inexistente, escreve direito");
		}

	}
}
