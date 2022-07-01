/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4jave;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author atdig
 */
public class Laboratoire extends JFrame {   
    InputArea inputPan;
    CalculPerimetre calper;
    CalculSurface calsur;
    Laboratoire(){
        this.setTitle("Calculator Graphic");
        this.setSize(900, 760);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        //JPanel scrollPan = new JPanel();
        //scrollPan.setLayout(new BorderLayout());
        //this.add(new JScrollPane(scrollPan), BorderLayout.CENTER);
        
        inputPan = new InputArea();
        this.add(inputPan, BorderLayout.NORTH);
        calper = new CalculPerimetre ();
        this.add(calper, BorderLayout.CENTER);
        calsur = new CalculSurface();
        this.add(calsur, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }    
}
