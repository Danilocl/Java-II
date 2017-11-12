
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TelaDeCadastro {

    JLabel labelTelaDeCadastro;

    JLabel labelCodigo, labelNome, labelQuantidade;

    JTextField campoCodigo, campoNome, campoQuantidade;

    JButton botaoCadastrar;

    TelaDeCadastro(Container tela) {

        tela.removeAll();

        labelTelaDeCadastro = new JLabel("TELA DE CADASTRO");
        labelTelaDeCadastro.setBounds(420, 80, 180, 25);

        tela.add(labelTelaDeCadastro);

        labelCodigo = new JLabel("CÓDIGO");
        labelCodigo.setBounds(380, 120, 120, 20);

        tela.add(labelCodigo);

        labelNome = new JLabel("NOME");
        labelNome.setBounds(380, 140, 120, 20);

        tela.add(labelNome);

        labelQuantidade = new JLabel("QUANTIDADE");
        labelQuantidade.setBounds(380, 165, 120, 20);

        tela.add(labelQuantidade);

        campoCodigo = new JTextField();
        campoCodigo.setBounds(480, 120, 100, 20);

        campoCodigo.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

                int x;

                try {

                    x = Integer.parseInt(campoCodigo.getText() + e.getKeyChar());

                } catch (Exception ex) {

                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e
            ) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e
            ) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        tela.add(campoCodigo);

        campoNome = new JTextField();

        campoNome.setBounds(
                480, 140, 100, 20);

        tela.add(campoNome);

        campoQuantidade = new JTextField();

        campoQuantidade.setBounds(
                480, 165, 100, 20);
        
         campoQuantidade.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

                int x;

                try {

                    x = Integer.parseInt(campoQuantidade.getText()+ e.getKeyChar());

                } catch (Exception ex) {

                    e.consume();
                }
            }

            @Override
            public void keyPressed(KeyEvent e
            ) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e
            ) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        tela.add(campoQuantidade);

        botaoCadastrar = new JButton("CADASTRAR");

        botaoCadastrar.setBounds(
                480, 190, 120, 20);
        botaoCadastrar.addActionListener(
                new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Produto produto;
                produto = new Produto();

                produto.codigo = Integer.parseInt(campoCodigo.getText());
                produto.nome = campoNome.getText();
                produto.quantidade = Integer.parseInt(campoQuantidade.getText());

                produto.cadastrar();

                produto.desconectar();

                // JOptionPane.showMessageDialog(null, "OK");        
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        );

        tela.add(botaoCadastrar);

        tela.repaint();
    }

}
