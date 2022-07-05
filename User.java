/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4jave;


/**
 *
 * @author atdig
 */
public class User {
    private String user;
    private String password;
    
   public User(String user, String password){
       this.user = user;
       this.password = password;
   }
    
   public String GetUser(){
       return user;
   }
   public String GetPassword(){
       return password;
   }
}
