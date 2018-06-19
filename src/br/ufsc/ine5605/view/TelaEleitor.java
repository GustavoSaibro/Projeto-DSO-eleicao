/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.view;

import br.ufsc.ine5605.controller.ControladorEleitor;
import br.ufsc.ine5605.model.Eleitor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class TelaEleitor {

    private Scanner teclado;

    public TelaEleitor() {
    }


    public void opcoesEleitor() {
        teclado = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Opções de Eleitor");
        System.out.println("");
        System.out.println("1- Para Cadastrar Eleitor");
        System.out.println("2- Para Excluir Eleitor");
        System.out.println("3- Para Listar Eleitores ");
        System.out.println("4- Voltar");
        System.out.println("");
        opcao = teclado.nextInt();

        switch (opcao) {
		case 1:
			cadastrarEleitor();
			break;
		case 2:
			ExcluirEleitorByTitulo();
			break;
		case 3:
			ControladorEleitor.getInstancia().ListaEleitores();
			break;
                case 4:
                        ControladorEleitor.getInstancia().voltarAoMenuPrincipal();
                        break;
                default:
                        erroOpcoes();
			break;
		}

    }
    
    private void erroOpcoes(){
        System.out.println("Voce digitou um valor não valido!");
        opcoesEleitor();
    }

    private void cadastrarEleitor() {
        String nomeEleitor = "";
        int zonaEleitoral = 0;
        String nomeCidade = "";
        int titulo = 0;
        int secao = 0;
        System.out.println("Por favor, digite o nome do eleitor");
        nomeEleitor = teclado.next();
        System.out.println("Por favor, digite o número da zona eleitoral");
        teclado = new Scanner(System.in);
        zonaEleitoral = teclado.nextInt();
        System.out.println("Por favor, digite o nome da cidade do eleitor");
        teclado = new Scanner(System.in);
        nomeCidade = teclado.next();
        System.out.println("Por favor, digite o título do eleitor");
        teclado = new Scanner(System.in);
        titulo = teclado.nextInt();
        System.out.println("Por favor, digite a seção do eleitor");
        secao = teclado.nextInt();
        
        ControladorEleitor.getInstancia().cadastrarEleitor(nomeEleitor, zonaEleitoral, nomeCidade, titulo,secao);
    }

    private void ExcluirEleitorByTitulo() {
        int titulo = 0;
        System.out.println("Por favor, digite o título do eleitor que desejas excluir");
        titulo = teclado.nextInt();
        ControladorEleitor.getInstancia().excluirEleitorByTitulo(titulo);
    }

    public void listarEleitor(ArrayList<Eleitor> eleitores) {
        for (int i = 0; i < eleitores.size(); i++) {
            System.out.println(eleitores.get(i).getNomePessoa() + " " +
                    eleitores.get(i).getCidade().getNome() + " " + eleitores.get(i).getTituloEleitor());
        }
        ControladorEleitor.getInstancia().voltarAoMenuPrincipal();
    }

    public void erroDeCadastro() {
        System.out.println("Não foi possivel cadastrar. Numero já cadastrado!!");
    }

    public void removeu() {
        System.out.println("Eleitor removido com sucesso!!");
    }
    
    

}