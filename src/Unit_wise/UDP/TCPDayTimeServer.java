/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.UDP;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TCPDayTimeServer {
    public static void main(String[] args) throws Exception {
         
      ServerSocket ss = new ServerSocket(8080);  
     Socket s = ss.accept();
     DataInputStream din = new DataInputStream(s.getInputStream());
     DataOutputStream dout = new DataOutputStream(s.getOutputStream());             

     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));                
     String ClientSays = din.readUTF();
        System.out.println("Client Says:"+ClientSays);
        System.out.println("Sended current date and time");
     ///sending current date and time to client
     String date = new Date().toString();
     dout.writeUTF(date);                
     din.close();
     s.close();
     ss.close();
    }
}
