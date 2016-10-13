/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import conexao.ConnectionFactory;
import java.sql.Date;
import java.sql.SQLException;
import modelo.Contato;

/**
 *
 * @author neyju
 */
public class ContatoDao {

    private Connection conn;

    public ContatoDao() {
        this.conn = new ConnectionFactory().getConnection();
    }

    public void adiciona(Contato contato) {

        String sql = "insert into contatos "
                + "(nome, email, endereco, dataDeNascimento) "
                + "values (?,?,?,?)";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setString(4, String.valueOf(new Date(contato.getDataDeNascimento().getTimeInMillis())));
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
