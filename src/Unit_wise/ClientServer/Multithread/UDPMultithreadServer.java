
package Unit_wise.ClientServer.Multithread;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author shaky
 */
public class UDPMultithreadServer extends Thread{
    public void run() {
        try{
        int port = 12345;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String client = "";
        String server = "";

        DatagramSocket ds = new DatagramSocket(port); // Create a socket

        while (!client.equalsIgnoreCase("stop")) {
            byte[] receiveData = new byte[1024];
            DatagramPacket dp = new DatagramPacket(receiveData, receiveData.length);
            ds.receive(dp);

            client = new String(dp.getData(), 0, dp.getLength());
            System.out.println("Client Said: " + client);

            System.out.println("Enter your Reply:");
            server = reader.readLine();
            byte[] sendData = server.getBytes();

            InetAddress sendAddress = dp.getAddress();
            int sendPort = dp.getPort();
            DatagramPacket sendDP = new DatagramPacket(sendData, sendData.length, sendAddress, sendPort);
            ds.send(sendDP);
        }

        ds.close(); // Close the socket when done
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Thread udp = new UDPMultithreadServer();
        udp.start();
    }
}
