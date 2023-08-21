/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratice;
import java.net.*;
import java.io.*;
/**
 *
 * @author shaky
 */
public class ServerSide {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(8080);
            Socket s =  ss.accept();
            
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str1="",str2="";
            
            while(str1 != "stop"){
            str1= din.readUTF();
                System.out.println("client says"+str1);
                System.out.println("enter your message");
                str2 = br.readLine();
                dout.writeUTF(str2);              
                dout.flush();           
            
            }
            din.close();
            s.close();
            ss.close();
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
