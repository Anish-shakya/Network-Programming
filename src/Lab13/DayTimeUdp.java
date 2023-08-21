/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab13;
import java.io.IOException;
import java.net.*;

public class DayTimeUdp {

    public static void main(String[] args) {
        // Set the server address and port
        String serverAddress = "time.nist.gov";
        int serverPort = 13;

        try {
            // Create a UDP socket
            DatagramSocket socket = new DatagramSocket();

            // Set a timeout value for the socket
            socket.setSoTimeout(5000); // 5 seconds

            // Create a buffer to receive the server response
            byte[] buffer = new byte[512];

            // Create a DatagramPacket for the request
            DatagramPacket requestPacket = new DatagramPacket(new byte[1], 1, InetAddress.getByName(serverAddress), serverPort);

            // Send the request packet
            socket.send(requestPacket);

            // Create a DatagramPacket for the response
            DatagramPacket responsePacket = new DatagramPacket(buffer, buffer.length);

            try {
                // Receive the response packet
                socket.receive(responsePacket);

                // Convert the response to a string
                String response = new String(responsePacket.getData(), 0, responsePacket.getLength());

                // Print the response
                System.out.println("Server response: " + response);
            } catch (SocketTimeoutException e) {
                System.err.println("Socket receive timed out: " + e.getMessage());
            }

            // Close the socket
            socket.close();

        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}
