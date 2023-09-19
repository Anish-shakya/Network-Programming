/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.ClientServer;
import java.io.*;
import java.net.*;

public class UDPEchoServer {
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try  {
            DatagramSocket socket = new DatagramSocket(SERVER_PORT);
            System.out.println("UDP Echo Server started on port " + SERVER_PORT);

            
             String message = "";
            while (message !="exit") {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                message = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received message from client: " + message);

                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();

                byte[] sendData = message.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);
                socket.send(sendPacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

