package thread;

public class Contador extends Thread {

	private String nome;

	public Contador(String nome) {
		this.nome = nome;
	}

	public void run() {

		for (int i = 0; i < 1000; i++) {
			System.out.println(nome + " " + "-" + i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}