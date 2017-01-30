/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;

/**
 *
 * @author Clément
 */
public class Fenetre extends JFrame{
    
    public Fenetre(){
    this.setTitle("Sudoku de merde");

    this.setSize(700, 700);

    this.setLocationRelativeTo(null);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
   
    JPanel cell1 = new JPanel();
    cell1.setLayout(new GridLayout(3, 3));
    for(int i=0;i<9;i++){
    cell1.add(new JButton("1")); 
    }

    cell1.setBackground(Color.GRAY);

    cell1.setPreferredSize(new Dimension(200, 200));      

    JPanel cell2 = new JPanel();
    cell2.setLayout(new GridLayout(3, 3));
    for(int i=0;i<9;i++){
    cell2.add(new JButton("2")); 
    }

    cell2.setBackground(Color.LIGHT_GRAY);

    cell2.setPreferredSize(new Dimension(200, 200));

    JPanel cell3 = new JPanel();
    cell3.setLayout(new GridLayout(3, 3));
    for(int i=0;i<9;i++){
    cell3.add(new JButton("3")); 
    }

    cell3.setBackground(Color.GRAY);

    cell3.setPreferredSize(new Dimension(200, 200));

    JPanel cell4 = new JPanel();
    cell4.setLayout(new GridLayout(3, 3));
    for(int i=0;i<9;i++){
    cell4.add(new JButton("4")); 
    }

    cell4.setBackground(Color.LIGHT_GRAY);

    cell4.setPreferredSize(new Dimension(200, 200));

    JPanel cell5 = new JPanel();
    cell5.setLayout(new GridLayout(3, 3));
    for(int i=0;i<9;i++){
    cell5.add(new JButton("5")); 
    }

    cell5.setBackground(Color.GRAY);

    cell5.setPreferredSize(new Dimension(200, 200));

    JPanel cell6 = new JPanel();
    cell6.setLayout(new GridLayout(3, 3));
    for(int i=0;i<9;i++){
    cell6.add(new JButton("6")); 
    }

    cell6.setBackground(Color.LIGHT_GRAY);

    cell6.setPreferredSize(new Dimension(200, 200));

    JPanel cell7 = new JPanel();
    cell7.setLayout(new GridLayout(3, 3));
    for(int i=0;i<9;i++){
    cell7.add(new JButton("7")); 
    }

    cell7.setBackground(Color.GRAY);

    cell7.setPreferredSize(new Dimension(200, 200));

    JPanel cell8 = new JPanel();
    cell8.setLayout(new GridLayout(3, 3));
    for(int i=0;i<9;i++){
    cell8.add(new JButton("8")); 
    }

    cell8.setBackground(Color.LIGHT_GRAY);

    cell8.setPreferredSize(new Dimension(200, 200));
    
    JPanel cell9 = new JPanel();
    cell9.setLayout(new GridLayout(3, 3));
    for(int i=0;i<9;i++){
    cell9.add(new JButton("9")); 
    }
    
    cell9.setBackground(Color.GRAY);
    
    cell9.setPreferredSize(new Dimension(200,200));

        

    //Le conteneur principal

    JPanel content = new JPanel();

    content.setPreferredSize(new Dimension(600, 600));

    content.setBackground(Color.WHITE);

    //On définit le layout manager

    content.setLayout(new GridBagLayout());

        

    //L'objet servant à positionner les composants

    GridBagConstraints gbc = new GridBagConstraints();

        

    //On positionne la case de départ du composant

    gbc.gridx = 0;

    gbc.gridy = 0;

    //La taille en hauteur et en largeur

    gbc.gridheight = 1;

    gbc.gridwidth = 1;

    content.add(cell1, gbc);

    //---------------------------------------------

    gbc.gridx = 1;
    
    gbc.gridy = 0;

    content.add(cell2, gbc);

    //---------------------------------------------

    gbc.gridx = 2;
    
    gbc.gridy = 0;

    content.add(cell3, gbc);        

    //---------------------------------------------

    //Cette instruction informe le layout que c'est une fin de ligne

    //gbc.gridwidth = GridBagConstraints.REMAINDER;

    gbc.gridx = 0; 
    
    gbc.gridy = 1;

    content.add(cell4, gbc);

    //---------------------------------------------

    gbc.gridx = 1;

    gbc.gridy = 1;

    gbc.gridwidth = 1;

    gbc.gridheight = 1;

    //Celle-ci indique que la cellule se réplique de façon verticale

    //gbc.fill = GridBagConstraints.VERTICAL;

    content.add(cell5, gbc);

    //---------------------------------------------

    gbc.gridx = 2;

    gbc.gridheight = 1;

    //Celle-ci indique que la cellule se réplique de façon horizontale

    //gbc.fill = GridBagConstraints.HORIZONTAL;

    //gbc.gridwidth = GridBagConstraints.REMAINDER;

    content.add(cell6, gbc);

    //---------------------------------------------

    gbc.gridx = 0;

    gbc.gridy = 2;

    //gbc.gridwidth = 1;

    content.add(cell7, gbc);

    //---------------------------------------------

    gbc.gridx = 1;
    
    gbc.gridy = 2;

    //gbc.gridwidth = GridBagConstraints.REMAINDER;

    content.add(cell8, gbc);

    //---------------------------------------------
    gbc.gridx = 2;
    
    gbc.gridy = 2;
    
    content.add(cell9, gbc);
    //On ajoute le conteneur

    this.setContentPane(content);

    this.setVisible(true);      
    
    }
    
    
    
}
