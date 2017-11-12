
import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Produto {

    String baseDeDados = "jdbc:mysql://127.0.0.1:3306/estoque";

    int codigo;
    String nome;
    int quantidade;

    Connection conexao;
    Statement stmt;

    Produto() {
        try {
            conexao = DriverManager.getConnection(baseDeDados, "root", "");
            stmt = conexao.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void cadastrar() {
        String instrucao;

        instrucao = "insert into produto values ( " + this.codigo + " , '" + this.nome + "' , " + this.quantidade + " );";
        // JOptionPane.showMessageDialog(null, instrucao);
        try {
            stmt.execute(instrucao);
            JOptionPane.showMessageDialog(null, "SUCESSO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"FALHA " + ex.getLocalizedMessage());
        }
    }

    void deletar() {
        String instrucao;
        instrucao = "delete from produto where codigo=" + this.codigo+";";
        try {
            stmt.execute(instrucao);
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    void pesquisar() {
        String instrucao;
        instrucao = "select * from produto (" + this.codigo + ", '" + this.nome + "', " + this.quantidade + " )";

        try {
            stmt.execute(instrucao);
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void update() {
        String instrucao;
        instrucao = "update produto set nome = '"  + this.nome + "', quantidade = " + this.quantidade + " where codigo=" + this.codigo+";";
        JOptionPane.showMessageDialog(null, instrucao);
        try {
            stmt.execute(instrucao);
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void desconectar() {

        try {
            conexao.close();
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
