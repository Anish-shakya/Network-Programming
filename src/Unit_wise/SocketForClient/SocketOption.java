/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.SocketForClient;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

public class SocketOption {
    public static void main(String[] args) {
        try {
            // Create a socket
            Socket socket = new Socket("example.com", 80);

            // Set socket options
            // 1. Timeout for blocking operations (in milliseconds)
            socket.setSoTimeout(5000); // 5 seconds timeout for read operations

            // 2. Reuse address option
            socket.setReuseAddress(true);

            // 3. Keep-alive option
            socket.setKeepAlive(true);

            // 4. TCP_NODELAY option (disable Nagle's algorithm)
            socket.setTcpNoDelay(true);

            // 5. Socket send buffer size
            socket.setSendBufferSize(8192); // 8KB buffer size for sending data

            // 6. Socket receive buffer size
            socket.setReceiveBufferSize(8192); // 8KB buffer size for receiving data

            // 7. SO_LINGER option
            socket.setSoLinger(true, 10); // linger for 10 seconds before closing

            // Print socket options
            System.out.println("Timeout: " + socket.getSoTimeout());
            System.out.println("Reuse Address: " + socket.getReuseAddress());
            System.out.println("Keep Alive: " + socket.getKeepAlive());
            System.out.println("TCP No Delay: " + socket.getTcpNoDelay());
            System.out.println("Send Buffer Size: " + socket.getSendBufferSize());
            System.out.println("Receive Buffer Size: " + socket.getReceiveBufferSize());
            System.out.println("So Linger: " + socket.getSoLinger());

            // Close the socket
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}