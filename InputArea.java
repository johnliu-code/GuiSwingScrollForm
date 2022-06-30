/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4jave;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author atdig
 */
public class InputArea extends JPanel {
    public static JTextField longueurField, largeurField, resultatField;
    InputArea(){
        this.setLayout(new FlowLayout());
        
        JPanel panLeft = new JPanel();
        JPanel panCenter = new JPanel();
        JPanel panRight = new JPanel();
        
        this.add(panLeft);
        this.add(panCenter);
        this.add(panRight);
        
        JLabel longueur_l = new JLabel("Longueur");
        longueur_l.setBorder(new EmptyBorder(0, 0, 10, 0));
        longueurField = new JTextField(15);
        longueurField.setPreferredSize(new Dimension(100, 30));
        panLeft.setLayout(new BorderLayout());
        panLeft.add(longueur_l, BorderLayout.NORTH);
        panLeft.add(longueurField, BorderLayout.SOUTH);

        JLabel largeur_l = new JLabel("Largeur");
        largeur_l.setBorder(new EmptyBorder(0, 0, 10, 0));
        largeurField = new JTextField(15);
        largeurField.setPreferredSize(new Dimension(100, 30));
        panCenter.setLayout(new BorderLayout());
        panCenter.add(largeur_l, BorderLayout.NORTH);
        panCenter.add(largeurField, BorderLayout.SOUTH);        
        
        JLabel resultat = new JLabel("Resultat");
        resultat.setBorder(new EmptyBorder(0, 0, 10, 0));
        resultatField = new JTextField(15);
        resultatField.setPreferredSize(new Dimension(100, 30));
        panRight.setLayout(new BorderLayout());
        panRight.add(resultat, BorderLayout.NORTH);
        panRight.add(resultatField, BorderLayout.SOUTH);
       
        ((FlowLayout)this.getLayout()).setHgap(15);
        
        this.setBorder(new EmptyBorder(20, 20, 20, 20));
    }

    public static void addReult(String result) {
        resultatField.setText(result);
    }

}
