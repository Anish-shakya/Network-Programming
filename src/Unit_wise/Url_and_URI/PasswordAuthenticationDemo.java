/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.Url_and_URI;

import java.net.PasswordAuthentication;

public class PasswordAuthenticationDemo {
    public static void main(String[] args) {
        try{
        String username = "Anish Shakya";
        char password[] = {'p','a','s','s','w','o','r','d'};
        
        PasswordAuthentication authenticate = new PasswordAuthentication(username,password);
        
            System.out.println("UserName = "+authenticate.getUserName());
            System.out.println("Password = "+authenticate.getPassword());
            
            String pass = String.valueOf(authenticate.getPassword());
            System.out.println("Password = "+pass);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
