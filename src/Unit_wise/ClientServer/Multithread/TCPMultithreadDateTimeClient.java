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
import java.net.Socket;

/**
 *
 * @author shaky
 */
public class TCPMultithreadDateTimeClient extends Thread {
    public void run() {
        try{
        Socket s = new Socket("localhost", 8080);
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String send = "Send me Current Date and Time";
        dout.writeUTF(send);
        
        String date = din.readUTF();
        
        System.out.println("Current Date and Time is:"+date);
       
        dout.close();
        din.close();
        s.close();
        
    }catch(Exception e){
            System.out.println(e);
            }
}
        public static void main(String[] args) {
            
         for(int i=1;i<=5;i++){
        Thread tcp = new TCPMultithreadDateTimeClient();
        tcp.start();
         }
    }
}
