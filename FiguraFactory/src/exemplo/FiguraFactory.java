package exemplo;

public class FiguraFactory {

	public static Figura getFigura(String tipoFigura) {

		if (tipoFigura == null) {
			return null;
		}

		if (tipoFigura.equalsIgnoreCase("Circulo")) {
			return new Circulo();
		} else if (tipoFigura.equalsIgnoreCase("Triangulo")) {
			return new Triangulo();
		} else if (tipoFigura.equalsIgnoreCase("Quadrado")) {
			return new Quadrado();
		}
		return null;
	}
}