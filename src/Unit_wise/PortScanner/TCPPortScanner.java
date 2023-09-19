/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.PortScanner;

import java.net.Socket;

public class TCPPortScanner {
    public static void main(String[] args) {
        String host = "example.com"; // Replace with the target host
        int startPort = 1; // Start port number
        int endPort = 1024; // End port number (you can adjust this range)

        System.out.println("Scanning ports on " + host + "...");

        for (int port = startPort; port <= endPort; port++) {
            try {
                Socket socket = new Socket(host, port);
               System.out.println("Port " + port + " is open");
            } catch (Exception e) {
                System.out.println("port is closed");
            }
        }

        System.out.println("Port scanning completed.");
    }
}
