package thread;

import java.io.File;

import javax.swing.JOptionPane;

import exemplo.ManipulaArquivo;

public class VerificadorEmail extends Thread {

	private void notifica(File file) {
		ManipulaArquivo ma = new ManipulaArquivo();

		String msg = ma.lerArquivo(file);

		JOptionPane.showMessageDialog(null, msg, "Novo Email", JOptionPane.INFORMATION_MESSAGE);

	}

	public void run() {

		File arquivo = null;

		while (true) {

			arquivo = new File("c:/serializacao/email.txt");
			if (arquivo.exists())
			{
				notifica(arquivo);
				arquivo.delete();
			}
		}
	}

}
