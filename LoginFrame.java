/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4jave;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
    JLabel successMessage;
    public User user;
    public ArrayList<User> users = new ArrayList<User>();
   
    LoginFrame(){
        this.setTitle("Login / Register");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        
        
        JPanel panTop = new JPanel();
        JPanel panMiddle = new JPanel();
        JPanel panBottom = new JPanel();
       
        JLabel user = new JLabel("User");
        user.setBorder(new EmptyBorder(0, 0, 0, 36));
        userField = new JTextField(15);
        userField.setPreferredSize(new Dimension(100, 30));
        panTop.add(user);
        panTop.add(userField);
        panTop.setBorder(new EmptyBorder(20, 20, 20, 20));
        
        JLabel pass = new JLabel("Password");
        pass.setBorder(new EmptyBorder(0, 0, 0, 10));
        passField = new JTextField(15);
        passField.setPreferredSize(new Dimension(100, 30));
        panMiddle.add(pass);
        panMiddle.add(passField);
        
        btnLogin = new JButton("Login");
        btnRegister = new JButton("Register");

        panBottom.add(btnLogin);
        panBottom.add(btnRegister);
        panBottom.setBorder(new EmptyBorder(20, 20, 50, 20));
        panBottom.setLayout(new FlowLayout());
        ((FlowLayout)panBottom.getLayout()).setHgap(90);
        btnLogin.addActionListener(this);
        btnRegister.addActionListener(this);
        
        this.add(panTop, BorderLayout.NORTH);
        this.add(panMiddle, BorderLayout.CENTER);
        this.add(panBottom, BorderLayout.SOUTH);
        
        //Success message
        successMessage = new JLabel("");
        successMessage.setBorder(new EmptyBorder(20, 20, 20, 20));
        panBottom.add(successMessage);
        
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin){ 
            String username =  userField.getText();
            String mypassword = passField.getText();

            int finduser = 0;
            for(User fuser: users){
                if (fuser.GetUser().equals(username) && fuser.GetPassword().equals(mypassword))
                    finduser = 1;
            }
            if (finduser == 1){
                String message = "Login success!! Click OK to continue...";
                JOptionPane.showMessageDialog(null, message, "Login information", JOptionPane.INFORMATION_MESSAGE);
                dispose();
                Laboratoire lab = new Laboratoire();
            }
            else {
                userField.setText("");
                passField.setText("");
                String message = "Login failed, would you want to try again? Yes/No";
                int ans = JOptionPane.showConfirmDialog(null, message, "Try again Yes/No", JOptionPane.YES_NO_CANCEL_OPTION);
                if(ans == 1){
                    this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
                }  
            }
           /*
           if(username.equals("lab") && mypassword.equals("1234")){
             Laboratoire lab = new Laboratoire();
             System.out.println("User " + userField.getText().toString()+ " Login success!!");
             successMessage.setText("Login success!!");
           }
           else
               successMessage.setText("Wrong user or password! Please try: lab / 1234");
               
          */
        }
        
        if (e.getSource() == btnRegister){
            if (userField.getText() != null && passField.getText() != null){
                user = new User(userField.getText(), passField.getText());
                users.add(user);
                
                System.out.println("User register success!!");
            }
        }
    }
}
