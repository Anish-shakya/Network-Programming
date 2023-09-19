/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.UDP;


import java.net.*;
import java.util.Date;

public class UDPDayTimeServer {
    public static void main(String[] args) {
        try {
            
            int serverPort = 13;
            DatagramSocket socket = new DatagramSocket(serverPort);
            System.out.println("UDP Daytime Server is running on port " + serverPort);
              
                byte[] requestBuffer = new byte[1024];
                DatagramPacket requestPacket = new DatagramPacket(requestBuffer, requestBuffer.length);
                socket.receive(requestPacket);
                String received = new String(requestPacket.getData(),0,requestPacket.getLength());
                System.out.println("Client said:"+received);
             
                
                //sending the date and time 
                 String daytimeResponse = new Date().toString();
               byte[] responseData = daytimeResponse.getBytes();
               
                InetAddress clientAddress = requestPacket.getAddress();
                int clientPort = requestPacket.getPort();
               
                DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length, clientAddress, clientPort);
              
                socket.send(responsePacket);

                System.out.println("Response sent to " + clientAddress + ":" + clientPort);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
