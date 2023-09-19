/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.UDP;

import java.net.*;
import java.util.Date;

public class UDPDayTimeClient {
    public static void main(String[] args) {
        try {
          
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 13;
            String message = "Send me date and time";
            byte[] send = message.getBytes();
            DatagramSocket socket = new DatagramSocket();           
            DatagramPacket requestPacket = new DatagramPacket(send, send.length, serverAddress, serverPort);
            socket.send(requestPacket); 
            
            ////receive part
            byte[] responseBuffer = new byte[256];
            DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length);
            socket.receive(responsePacket);
            
            
            String serverResponse = new String(responsePacket.getData(), 0, responsePacket.getLength());
            System.out.println("Server Response: " + serverResponse);
             socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
