/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.model;

import java.io.Serializable;

/**
 *
 * @author Gustavo
 */
public class Cidade implements Serializable{
    
    private String nome;

    public Cidade(String nome) {
        this.nome = nome;
    }
    
    public Cidade(){
    	
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
