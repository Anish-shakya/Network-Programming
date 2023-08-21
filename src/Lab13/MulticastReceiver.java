/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver {
    public static void main(String[] args) {
        String multicastGroup = "224.0.0.1";  // Example multicast group IP
        int port = 5000;

        try {
            // Create a MulticastSocket bound to the specified port
            MulticastSocket socket = new MulticastSocket(port);

            // Join the multicast group
            InetAddress group = InetAddress.getByName(multicastGroup);
            socket.joinGroup(group);

            System.out.println("Waiting for multicast messages...");

            while (true) {
                // Create a buffer to receive incoming packets
                byte[] buffer = new byte[1024];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

                // Receive the packet
                socket.receive(packet);

                // Convert the packet data to a string
                String message = new String(packet.getData(), 0, packet.getLength());

                // Display the received message
                System.out.println("Received multicast message: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

