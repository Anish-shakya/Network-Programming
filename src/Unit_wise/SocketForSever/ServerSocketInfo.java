/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.SocketForSever;

import java.net.InetAddress;
import java.net.ServerSocket;

/**
 *
 * @author shaky
 */
public class ServerSocketInfo {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("localhost");
                              //ServerSocket(int port, int queueLenght,InetAddress address)
        ServerSocket ss = new ServerSocket(2050,2,address);
        InetAddress addr = ss.getInetAddress();
        int LocalPort = ss.getLocalPort();
        System.out.println(addr);
        System.out.println(LocalPort);
    }
}
