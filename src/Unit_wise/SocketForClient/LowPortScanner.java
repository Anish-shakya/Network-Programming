/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.SocketForClient;

import java.net.Socket;


public class LowPortScanner {
    public static void main(String[] args) {
        String localhost = "example.com"; // Localhost IP address

        for (int port = 0; port <= 1024; port++) {
            try {
                // Try to create a socket on the current port
                Socket socket = new Socket(localhost, port);
                System.out.println("Port " + port + " is open");
                socket.close();
            } catch (Exception e) {
                System.out.println("Port is Closed");
            }
        }
    }
}
