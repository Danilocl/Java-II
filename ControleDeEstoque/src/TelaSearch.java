
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 36115142016.2N
 */
public class TelaSearch {

    JButton listar;

    TelaSearch(Container tela) {

        tela.removeAll();

        listar = new JButton("LISTAR");
        listar.setBounds(480, 190, 120, 20);
        listar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Produto produto;
                produto = new Produto();

                produto.pesquisar();

                produto.desconectar();

                // JOptionPane.showMessageDialog(null, "OK");        
                // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }

}
