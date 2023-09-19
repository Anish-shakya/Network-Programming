/*
 * To change ;this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.OldQuestions;

import Unit_wise.ClientServer.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws Exception {
       int port = 8020;
       
       DatagramSocket socket = new DatagramSocket(port);
       
       byte[] receive = new byte[1024];
       
       DatagramPacket receivedData = new DatagramPacket(receive,0,receive.length);
       socket.receive(receivedData);
       String data = new String(receivedData.getData(),0,receivedData.getLength());
       
       int number = Integer.parseInt(data);
       //getting client port and address 
       InetAddress address = receivedData.getAddress();
       int clientPort = receivedData.getPort();
       ///checking for even or odd logic
       if(number % 2 == 0){
       String message = number + "is a even number";
       byte[] even = message.getBytes();
       DatagramPacket sendEven = new DatagramPacket(even,even.length,address,clientPort);
       socket.send(sendEven);
       }
       else{
        String message = number +" is a Odd number";
       byte[] odd = message.getBytes();
       DatagramPacket sendOdd = new DatagramPacket(odd,odd.length,address,clientPort);
       socket.send(sendOdd);
       }
       
    }
}
