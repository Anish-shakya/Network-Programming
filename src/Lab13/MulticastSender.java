/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab13;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastSender {
    public static void main(String[] args) {
        String multicastGroup = "224.0.0.1";  // Example multicast group IP
        int port = 5000;

        try {
            // Create a MulticastSocket
            MulticastSocket socket = new MulticastSocket();

            // Set the time-to-live (TTL) for the multicast packets (2 is a typical value)
            socket.setTimeToLive(2);

            // Create the message as a byte array
            String message = "Hello 3";
            byte[] buffer = message.getBytes();

            // Create a DatagramPacket with the message, multicast group, and port
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getByName(multicastGroup), port);

            // Send the packet
            socket.send(packet);

            // Close the socket
            socket.close();

            System.out.println("Sent multicast message: " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

