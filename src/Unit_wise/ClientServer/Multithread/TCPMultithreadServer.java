/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.ClientServer.Multithread;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author shaky
 */
public class TCPMultithreadServer extends Thread { 

  public void run() {
         try{
                ServerSocket ss = new ServerSocket(8080);  
                 
                Socket s = ss.accept();
                
                DataInputStream din = new DataInputStream(s.getInputStream());
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());             
                             
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
                String str = " ",str2 = " ";
                
                while(str  !=  "stop "){
                str = din.readUTF(); 
                    System.out.println("Client Says:"+str);
                    System.out.println("Enter message:");
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
    public static void main(String[] args) {
        Thread tcp = new TCPMultithreadServer();
        tcp.start();
    }
}
