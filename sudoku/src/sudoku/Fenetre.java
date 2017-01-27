/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
/**
 *
 * @author Clément
 */
public class Fenetre extends JFrame {
    
   public Fenetre(){

    this.setTitle("Sudoku");

    this.setSize(500, 500);

    this.setLocationRelativeTo(null);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    
    Container jp = new getContentPane();
    
    //jp.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    
    jp.setLayout(new GridLayout(3, 3));
    
    this.setVisible(true);
    
    

  }
    
}
