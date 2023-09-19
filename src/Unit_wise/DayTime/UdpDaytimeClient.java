/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.DayTime;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Date;

public class UdpDaytimeClient {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket
            DatagramSocket socket = new DatagramSocket();

            // Set the server's IP address and port
            InetAddress serverAddress = InetAddress.getByName("time.nist.gov");
            int serverPort = 13;

            // Create a request message (an empty message in UDP)
            byte[] requestData = new byte[1];
            DatagramPacket requestPacket = new DatagramPacket(requestData, requestData.length, serverAddress, serverPort);

            // Send the request
            socket.send(requestPacket);
            System.out.println("Request sent to server");

            // Create a buffer to receive the response
            byte[] responseData = new byte[512];
            DatagramPacket responsePacket = new DatagramPacket(responseData, responseData.length);

            // Receive the response
            socket.receive(responsePacket);

            // Display the raw response data as bytes
            System.out.println("Response data (bytes): " + new String(responseData, 0, responsePacket.getLength()));

            // Convert the response data to a string
            String daytimeResponse = new String(responsePacket.getData(), 0, responsePacket.getLength());
            Date today = new Date(daytimeResponse);
            System.out.println("Daytime response from server: " + today);

            // Close the socket
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
