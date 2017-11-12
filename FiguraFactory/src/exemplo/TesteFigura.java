package exemplo;

/**
 * Projeto implementando o design pattern "factory" 
 * @author 36115142016.2N
 *
 */

public class TesteFigura {

	public static void main(String[] args) {

		//Método getfigura é estatico
		
		Figura figura1 = FiguraFactory.getFigura("Quadrado");
		figura1.desenhar();

		Figura figura2 = FiguraFactory.getFigura("Triangulo");
		figura2.desenhar();

		Figura figura3 = FiguraFactory.getFigura("Circulo");
		figura3.desenhar();

	}

}
