/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.view;
import br.ufsc.ine5605.controller.ControladorPrincipal;



import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.GridBagConstraints;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe
 */
public class TelaApuracao extends JFrame{
    
   private JButton botao1; 
   private JLabel label;
    
    public TelaApuracao() {
       super("Tela de apuração");
       
        TelaApuracao.GerenciadorDeBotao btManager = new TelaApuracao.GerenciadorDeBotao();
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        GridBagConstraints bgc = new GridBagConstraints();
         
        label = new JLabel();
        label.setName("Opções:");
        label.setBounds(145, 10, 200, 50);
        container.add(label);
        
        botao1 = new JButton();
        botao1.setText("Apurar");
        botao1.setActionCommand("1");
        botao1.addActionListener(btManager);
        botao1.setBounds(450, 210, 250, 250);
        container.add(botao1, bgc);
        
        
       
        
       
        
        setSize(500, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
       
        
        setVisible(true);

        
        
       
        
    }

   
     private class GerenciadorDeBotao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            String opcao = ae.getActionCommand();
            
            if(opcao.equals("1")){
                
            }
           
        }

    }
    
    
}
