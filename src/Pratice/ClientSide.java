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
public class ClientSide {
    public static void main(String[] args) {
        try{
        Socket s = new Socket("localhost",8080);
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1 ="",str2="";
        
        while(!str1.equals("stop")){
            System.out.println("enter message");
            str1 =br.readLine();
            dout.writeUTF(str1);
            System.out.println("wait for server reply");
            str2 =din.readUTF();
            System.out.println("server says"+str2);
            dout.flush();
        }
        din.close();
        s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
