
package Unit_wise.ClientServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getByName("localhost");
        int port = 12345;
        String client = "";
        String server = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        DatagramSocket ds = new DatagramSocket(); // Create a socket outside the loop

        while (!client.equalsIgnoreCase("stop")) {
            System.out.println("Enter your Response Client:");
            client = reader.readLine();
            byte[] sendData = client.getBytes();

            DatagramPacket dp = new DatagramPacket(sendData, sendData.length, address, port);
            ds.send(dp);

            // Receiving from server
            byte[] receiveData = new byte[1024];
            DatagramPacket receiveDP = new DatagramPacket(receiveData, receiveData.length);
            ds.receive(receiveDP);

            server = new String(receiveDP.getData(), 0, receiveDP.getLength());
            System.out.println("Server Replied: " + server);
        }

        ds.close(); // Close the socket when done
    }
}
