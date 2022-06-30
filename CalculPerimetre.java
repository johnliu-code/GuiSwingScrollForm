/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4jave;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author atdig
 */
public class CalculPerimetre extends JPanel implements ActionListener{
    InputArea inputValeur;
    JButton btnCalPer;
    JTextArea areaPer;
    CalculPerimetre(){
        this.setLayout(new BorderLayout());
        
        JLabel title = new JLabel("Calcul Perimetre");
        JPanel panTitle = new JPanel();
        panTitle.add(title);
        this.add(panTitle, BorderLayout.NORTH);
        panTitle.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JPanel pancal = new JPanel();
        pancal.setLayout(new FlowLayout());
        btnCalPer = new JButton("Calcu de Perimetre");
        areaPer = new JTextArea(10, 20);
        pancal.add(btnCalPer);
        pancal.add(areaPer);
        this.add(pancal, BorderLayout.SOUTH);
        ((FlowLayout)pancal.getLayout()).setHgap(80);
        btnCalPer.addActionListener(this);
        
        this.setBorder(new EmptyBorder(20, 20, 20, 20));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Calculate perimetre based on static values from class inputarea
        float longueur, largeur, perimetre;
        longueur = Float.parseFloat(inputValeur.longueurField.getText());
        largeur = Float.parseFloat(inputValeur.largeurField.getText());

        if (e.getSource() == btnCalPer){
           perimetre = 2 * (longueur+ largeur);
            inputValeur.addReult(" Perimetre = " + Float.toString(perimetre));      //Dispaly result in result textfield
            areaPer.append("\n    Longueur: " + inputValeur.longueurField.getText() + "\n"
                    + "    Largeur: " + inputValeur.largeurField.getText() + "\n"
                    + "\n    Perimetre = " 
                    + Float.toString(perimetre) + "\n");
        }
    }
    
}
