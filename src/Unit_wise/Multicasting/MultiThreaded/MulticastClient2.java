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

public class MulticastClient2 {
    public static void main(String[] args) {
        try {
            // Create a multicast socket bound to the same group address and port as the server
            InetAddress group = InetAddress.getByName("239.0.0.1");
            int port = 8888;
            MulticastSocket clientSocket = new MulticastSocket(port);
            clientSocket.joinGroup(group);

            System.out.println("Client is listening...");

            // Receive data from the multicast group
            Thread receiveThread = new Thread(() -> {
                try {
                    while (true) {
                        byte[] buffer = new byte[256];
                        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                        clientSocket.receive(packet);

                        String receivedMessage = new String(packet.getData(), 0, packet.getLength());
                        System.out.println("Received: " + receivedMessage);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            receiveThread.start();

            // Sending messages from this client
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String input;
            while ((input = reader.readLine()) != null) {
                DatagramPacket sendPacket = new DatagramPacket(input.getBytes(), input.length(), group, port);
                clientSocket.send(sendPacket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
