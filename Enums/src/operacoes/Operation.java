package operacoes;

public enum Operation {

	multiplicacao, subtracao, soma, divisao;

	double calculo(double x, double y) {

		switch (this) {

		case divisao:

			return x / y;

		case soma:

			return x + y;

		case subtracao:
			return x - y;

		case multiplicacao:

			return x * y;

		default:
			throw new AssertionError("Operção desconhecida");

		}

	}
}
