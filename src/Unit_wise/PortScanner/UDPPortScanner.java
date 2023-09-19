/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.PortScanner;

import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;

public class UDPPortScanner {
    public static void main(String[] args) {
        String host = "localhost"; // Replace with the target host
        int startPort = 1; // Start port number
        int endPort = 1024; // End port number (you can adjust this range)

        System.out.println("Scanning UDP ports on " + host + "...");

        try {
            InetAddress targetAddress = InetAddress.getByName(host);

            for (int port = startPort; port <= endPort; port++) {
                try (DatagramSocket socket = new DatagramSocket()) {
                    socket.setSoTimeout(1000); // Timeout in milliseconds

                    byte[] sendData = new byte[0];
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, targetAddress, port);
                    socket.send(sendPacket);

                    byte[] receiveData = new byte[1024];
                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                    socket.receive(receivePacket);
                    // If no exception is thrown, the port is open
                    System.out.println("UDP Port " + port + " is open");
                } catch (Exception e) {
                    System.out.println("Port is closed");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("UDP port scanning completed.");
    }
}
