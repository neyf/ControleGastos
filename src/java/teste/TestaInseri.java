/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dao.ContatoDao;
import java.util.Calendar;
import modelo.Contato;

/**
 *
 * @author neyju
 */
public class TestaInseri {

    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Caelum");
        contato.setEmail("contato@caelum.com.br");
        contato.setEndereco("R. Vergueiro 3185 cj87");
        contato.setDataDeNascimento(Calendar.getInstance());
        
        // grave nesta conexão
        ContatoDao bd = new ContatoDao();

        // método elegante
        bd.adiciona(contato);

        System.out.println("Gravado!");
    }
}
