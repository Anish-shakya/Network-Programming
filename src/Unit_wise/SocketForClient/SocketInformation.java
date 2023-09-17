/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.SocketForClient;

import java.net.*;
public class SocketInformation {
    public static void main(String[] args) throws Exception {
        InetAddress addr = InetAddress.getByName("www.example.com");
        //here we can pass InetAddress object or a Stirng in InetSocketAddress
        String host = "www.example.com";
        int port = 80;
        
        Socket socket = new Socket(); // here i can simple pass host and port as parameter 
                                      //and get rid of below two line 
        SocketAddress address = new InetSocketAddress(addr,port);        
        socket.connect(address);
        
        InetAddress RemoteAddress = socket.getInetAddress();
        InetAddress LocalAddress  = socket.getLocalAddress();
        
        int RemotePort = socket.getPort();
        int LocalPort = socket.getLocalPort();
        
        System.out.println(RemoteAddress);
        System.out.println(RemotePort);
        
        System.out.println(LocalAddress.getHostAddress());        
        System.out.println(LocalPort);
    }
}
