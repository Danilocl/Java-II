
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
public class TelaDeletar {

    JLabel labelRemove;
    JLabel labelCodigo;
    JTextField campoCodigo;
    JButton botaoRemover;

    TelaDeletar(Container tela) {

        tela.removeAll();

        labelRemove = new JLabel("TELA DE REMOÇÃO");
        labelRemove.setBounds(420, 80, 180, 25);

        tela.add(labelRemove);

        labelCodigo = new JLabel("CÓDIGO");
        labelCodigo.setBounds(380, 120, 120, 20);

        campoCodigo = new JTextField();
        campoCodigo.setBounds(480, 120, 100, 20);

        tela.add(labelCodigo);
        
        tela.add(campoCodigo);

        botaoRemover = new JButton("Remover");
        botaoRemover.setBounds(480, 190, 120, 20);
        botaoRemover.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Produto produto;
                produto = new Produto();

                produto.codigo = Integer.parseInt(campoCodigo.getText());
                produto.deletar();

                produto.desconectar();

                // JOptionPane.showMessageDialog(null, "OK");        
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        tela.add(botaoRemover);
        tela.repaint();
    }
}
