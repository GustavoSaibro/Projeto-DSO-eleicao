/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.model;

/**
 *
 * @author Gustavo
 */
public class Candidato extends Pessoa {
    
    private Partido partido;
    private Cargo cargo;
    private String nome;

    public Partido getPartido() {
        return partido;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
    
}
