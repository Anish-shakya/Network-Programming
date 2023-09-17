/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.Multicasting.MultiThreaded;

import java.io.*;
import java.net.*;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class MulticastServer {
    public static void main(String[] args) {
        try {
            // Create a multicast socket bound to a specific group address and port
            InetAddress group = InetAddress.getByName("239.0.0.1");
            int port = 8888;
            MulticastSocket serverSocket = new MulticastSocket(port);
            serverSocket.joinGroup(group);

            System.out.println("Server is running...");

            Map<String, InetAddress> clients = new HashMap<>(); // Store client information

            while (true) {
                // Receive data from the multicast group
                byte[] buffer = new byte[256];
                DatagramPacket receivedPacket = new DatagramPacket(buffer, buffer.length);
                serverSocket.receive(receivedPacket);

                // Convert the received data to a string and display it
                String receivedMessage = new String(receivedPacket.getData(), 0, receivedPacket.getLength());

                // Check if the message is from a new client
                InetAddress clientAddress = receivedPacket.getAddress();
                if (!clients.containsValue(clientAddress)) {
                    String clientKey = "Client" + clients.size();
                    clients.put(clientKey, clientAddress);
                    System.out.println("New client joined: " + clientKey);
                }

                // Forward the received message to all clients except the sender
                for (Map.Entry<String, InetAddress> entry : clients.entrySet()) {
                    if (!entry.getValue().equals(clientAddress)) {
                        DatagramPacket sendPacket = new DatagramPacket(receivedMessage.getBytes(), receivedMessage.length(), entry.getValue(), port);
                        serverSocket.send(sendPacket);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
