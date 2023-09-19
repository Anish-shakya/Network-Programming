/*
 * To change ;this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.ClientServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        int port = 12345;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String client = "";
        String server = "";

        DatagramSocket ds = new DatagramSocket(port); // Create a socket

        while (!client.equalsIgnoreCase("stop")) {
            byte[] receiveData = new byte[1024];
            DatagramPacket dp = new DatagramPacket(receiveData, receiveData.length);
            ds.receive(dp);

            client = new String(dp.getData(), 0, dp.getLength());
            System.out.println("Client Said: " + client);

            System.out.println("Enter your Reply:");
            server = reader.readLine();
            byte[] sendData = server.getBytes();

            InetAddress sendAddress = dp.getAddress();
            int sendPort = dp.getPort();
            DatagramPacket sendDP = new DatagramPacket(sendData, sendData.length, sendAddress, sendPort);
            ds.send(sendDP);
        }

        ds.close(); // Close the socket when done
    }
}
