/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.NonBlockingIo;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class SimpleServer {

    public static void main(String[] args) {
        int port = 8080; // Specify the port you want to listen on

        try {
            // Create a ServerSocketChannel
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();

            // Bind the ServerSocketChannel to a specific address and port
            serverSocketChannel.bind(new InetSocketAddress(port));
            System.out.println("Server listening on port " + port);

  
                SocketChannel socketChannel = serverSocketChannel.accept();
                System.out.println("Accepted connection from: " + socketChannel.getRemoteAddress());
               
                socketChannel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
