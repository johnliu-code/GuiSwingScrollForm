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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author atdig
 */
public class CalculSurface extends JPanel implements ActionListener {
    InputArea inputValeur;
    JButton btnCalSur;
    JTextArea areaSur;
    CalculSurface(){
        this.setLayout(new BorderLayout());
        
        JLabel title = new JLabel("Calcul Surface");
        JPanel panTitle = new JPanel();
        panTitle.add(title);
        this.add(panTitle, BorderLayout.NORTH);
        panTitle.setBorder(new EmptyBorder(20, 20, 20, 20));
                
        JPanel pancal = new JPanel();
        pancal.setLayout(new FlowLayout());
        btnCalSur = new JButton("Calcu de Surface");
        areaSur = new JTextArea(10, 20);
        JScrollPane scroll = new JScrollPane (areaSur);
        
        pancal.add(btnCalSur);
        pancal.add(scroll);
        this.add(pancal, BorderLayout.SOUTH);
        ((FlowLayout)pancal.getLayout()).setHgap(160);
        btnCalSur.addActionListener(this);
        
        this.setBorder(new EmptyBorder(20, 20, 20, 20));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                //Calculate perimetre based on static values from class inputarea
        float longueur, largeur, perimetre;
        longueur = Float.parseFloat(inputValeur.longueurField.getText());
        largeur = Float.parseFloat(inputValeur.largeurField.getText());

        if (e.getSource() == btnCalSur){
           perimetre = longueur * largeur;
            inputValeur.addReult(" Surface = " + Float.toString(perimetre));      //Dispaly result in result textfield
            areaSur.append("\n    Longueur: " + inputValeur.longueurField.getText() + "\n"
                    + "    Largeur: " + inputValeur.largeurField.getText() + "\n"
                    + "\n    Surface = " 
                    + Float.toString(perimetre) + "\n");
        }
    }
}
