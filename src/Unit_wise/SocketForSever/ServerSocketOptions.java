/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.SocketForSever;

import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketOptions {
    public static void main(String[] args) throws Exception {
        InetAddress address  = InetAddress.getByName("www.example.com");
        int port = 8000;
        ServerSocket ss = new ServerSocket(port);
        
        ss.setSoTimeout(1000);
        ss.setReuseAddress(true);
        ss.setReceiveBufferSize(8000);
        
        System.out.println("Timeout:"+ss.getSoTimeout());
        System.out.println("Reuse Address:"+ss.getReuseAddress());
        System.out.println("Receive Buffer size:"+ss.getReceiveBufferSize());
        
    }
}
