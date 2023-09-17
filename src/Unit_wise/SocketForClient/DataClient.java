/*
 Sending Data to Server
 */
package Unit_wise.SocketForClient;

import java.io.OutputStream;
import java.net.Socket;

import java.io.OutputStream;
import java.net.Socket;

public class DataClient {
    public static void main(String[] args) {
        String serverAddress = "www.example.com"; // Replace with the server address you want to connect to
        int serverPort = 8000; // Replace with the server's port number

        try {
            // Create a socket connection to the server
            Socket socket = new Socket(serverAddress, serverPort);

            // Get the output stream from the socket
            OutputStream out = socket.getOutputStream();

            // Data to be sent to the server
            String dataToSend = "Hello, Server!";
            
            // Convert the data to bytes and write it to the server
            byte[] dataBytes = dataToSend.getBytes();
            out.write(dataBytes);
            out.flush(); // Flush the output stream

            // Close the socket when done
            socket.close();

         System.out.println("Data sent to the server successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

