/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.view;

import br.ufsc.ine5605.controller.ControladorUrna;
import br.ufsc.ine5605.model.Urna;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TelaUrna {
    
    private Scanner teclado;

    public TelaUrna() {
        teclado = new Scanner(System.in);
    }
    
    public void opcoesUrna(){
        teclado = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Opções de Urna");
        System.out.println("");
        System.out.println("1- Cadastrar Urna");
        System.out.println("2- Excluir Urna");
        System.out.println("3- Listar Urna");
        System.out.println("4- Voltar");
        System.out.println("");
        
        opcao = teclado.nextInt();
        switch(opcao){
            case 1:
                cadastrarUrna();
                break;
            case 2:
                excluirUrna();
                break;
            case 3:
                ControladorUrna.getInstancia().listarUrnas();
                break;
            case 4:
                ControladorUrna.getInstancia().voltarAoMenuPrincipal();
                break;
            default:
                erroOpcoes();
                break;
        }
    }
    
    private void erroOpcoes() {
        System.out.println("Voce digitou um valor não valido!");
        opcoesUrna();
    }
    
    public void cadastrarUrna(){
        teclado = new Scanner(System.in);
        int secao = 0;
        String cidadeUrna = " ";
        System.out.println("Digite a seção da urna");
        secao = teclado.nextInt();
        System.out.println("Digite a cidade a qual a urna irá pertencer");
        cidadeUrna = teclado.next();
        
        ControladorUrna.getInstancia().cadastrarUrna(secao, cidadeUrna);
        ControladorUrna.getInstancia().voltarAoMenuPrincipal();
    }
    public void excluirUrna(){
    
    
    }
    
    
    public void listarUrnas(ArrayList<Urna> urnas){
        for (int i = 0; i < urnas.size(); i++) {
            System.out.println("Urna Seção:"+urnas.get(i).getSecao() + ", Cidade :" + urnas.get(i).getCidade().getNome());

        }
    }

    public void urnaJaCadastrada() {
        System.out.println("Urna com esta secão já cadastrada!!");
    }

    public void removeuUrna() {
        System.out.println("Urna removida com sucesso!!");
    }
    
}
