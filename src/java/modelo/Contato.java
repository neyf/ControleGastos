/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Calendar;

/**
 *
 * @author neyju
 */
public class Contato {
    
    private int idcontato;
    private String nome;
    private String email;
    private String endereco;
    private Calendar dataDeNascimento;

    public void setIdcontato(int idcontato) {
        this.idcontato = idcontato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataDeNascimento(Calendar dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdcontato() {
        return idcontato;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Calendar getDataDeNascimento() {
        return dataDeNascimento;
    }
}
