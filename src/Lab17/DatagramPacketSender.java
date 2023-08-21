/*write a simple program to create datagram packet(Hello) using DatagramSocket*/
package Lab17;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramPacketSender {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket
            DatagramSocket socket = new DatagramSocket();

            // Define the message to be sent
            String message = "Hello";
            byte[] sendData = message.getBytes();

            // Specify the destination IP address and port number
            InetAddress ipAddress = InetAddress.getByName("localhost");
            int port = 12345;

            // Create a DatagramPacket with the message, destination address, and port
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, ipAddress, port);

            // Send the packet
            socket.send(sendPacket);

            System.out.println("Packet sent successfully.");

            // Close the socket
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

