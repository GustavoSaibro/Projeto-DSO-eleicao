/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.view;
import br.ufsc.ine5605.controller.ControladorPrincipal;
import java.util.Scanner;


/**
 *
 * @author Felipe
 */
public class TelaApuracao {
    private ControladorPrincipal controladorPrincipal;
    private Scanner teclado;

    public TelaApuracao(ControladorPrincipal controladorPrincipal) {
        this.controladorPrincipal = controladorPrincipal;
        this.teclado = new Scanner(System.in);
    }

   public void opcoesApuracao(){
       int opcao;
       System.out.println("Opções de Apuração");
       System.out.println("");
       System.out.println("Digite 1 para apurar uma urna");
       System.out.println("Digite 2 para apuração geral");
       System.out.println("");
       opcao = teclado.nextInt();
       
       switch(opcao){
           case 1:
               int secao = 0;
               controladorPrincipal.listarUrna();
               System.out.println("Digite a secao da urna que deseja apurar");
               secao = teclado.nextInt();
              break;
            case 2:
               int escolhaCidade = 0;
               System.out.println("Qual cidade deseja fazer a apuração?");
               System.out.println("Digite 1 para Floripa");
               System.out.println("Digite 2 para São José");
               escolhaCidade = teclado.nextInt();
               break;
            default:
                erroOpcoes();
                break;
       }
   } 
   
   private void erroOpcoes(){
        System.out.println("Voce digitou um valor não valido!");
        opcoesApuracao();
    }
    
    
}
