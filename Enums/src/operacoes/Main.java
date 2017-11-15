package operacoes;

public class Main {

	public static void main(String[] args) {
		
		double p = Operation.divisao.calculo(30, 15);
		
		System.out.println("\n" + p);

		System.out.println("\n" + Operation.multiplicacao.calculo(50, 10));

		System.out.println("\n" + Operation.soma.calculo(50, 10));

		System.out.println("\n" + Operation.subtracao.calculo(50, 10));
	}
}
