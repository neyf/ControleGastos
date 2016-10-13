/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author neyju
 */
public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection conn = new ConnectionFactory().getConnection();
        System.out.println("Conectado!");
        conn.close();
    }
}
