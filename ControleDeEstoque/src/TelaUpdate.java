
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 36115142016.2N
 */
public class TelaUpdate {


    JLabel labelTelaDeUpdate;

    JLabel labelCodigo, labelNome, labelQuantidade;
    
    JTextField campoCodigo, campoNome, campoQuantidade;
    
    JButton botaoUpdate;
    
    TelaUpdate(Container tela) {
        
        tela.removeAll();

        labelTelaDeUpdate = new JLabel("TELA DE ATUALIZAÇÃO");
        labelTelaDeUpdate.setBounds(420, 80, 180, 25);

        tela.add(labelTelaDeUpdate);

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

        tela.add(campoCodigo);

        campoNome = new JTextField();
        campoNome.setBounds(480, 140, 100, 20);

        tela.add(campoNome);

        campoQuantidade = new JTextField();
        campoQuantidade.setBounds(480, 165, 100, 20);

        tela.add(campoQuantidade);

        botaoUpdate = new JButton("ATUALIZAR");
        botaoUpdate.setBounds(480, 190, 120, 20);
        botaoUpdate.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Produto produto;
                produto = new Produto();

                produto.codigo = Integer.parseInt(campoCodigo.getText());
                produto.nome = campoNome.getText();
                produto.quantidade = Integer.parseInt(campoQuantidade.getText());

                produto.update();

                produto.desconectar();

                // JOptionPane.showMessageDialog(null, "OK");        
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        tela.add(botaoUpdate);

        tela.repaint();
    }
    
}
