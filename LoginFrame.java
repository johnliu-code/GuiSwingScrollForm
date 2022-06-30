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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author atdig
 */
public class LoginFrame extends JFrame implements ActionListener {
    JTextField userField, passField;
    JButton btnLogin, btnRegister;
    LoginFrame(){
        this.setTitle("Login / Register");
        this.setSize(400, 240);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        
        JPanel panTop = new JPanel();
        JPanel panMiddle = new JPanel();
        JPanel panBottom = new JPanel();
       
        JLabel user = new JLabel("User");
        user.setBorder(new EmptyBorder(0, 0, 0, 36));
        userField = new JTextField(15);
        panTop.add(user);
        panTop.add(userField);
        panTop.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel pass = new JLabel("Password");
        pass.setBorder(new EmptyBorder(0, 0, 0, 10));
        passField = new JTextField(15);
        panMiddle.add(pass);
        panMiddle.add(passField);
        
        btnLogin = new JButton("Login");
        btnRegister = new JButton("Register");

        panBottom.add(btnLogin);
        panBottom.add(btnRegister);
        panBottom.setBorder(new EmptyBorder(20, 20, 20, 20));
        panBottom.setLayout(new FlowLayout());
        ((FlowLayout)panBottom.getLayout()).setHgap(90);
        btnLogin.addActionListener(this);
        
        this.add(panTop, BorderLayout.NORTH);
        this.add(panMiddle, BorderLayout.CENTER);
        this.add(panBottom, BorderLayout.SOUTH);
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin){ 
            Laboratoire lab = new Laboratoire();
            System.out.println("User " + userField.getText().toString()+ " Login success!!");
        }
    }
}
