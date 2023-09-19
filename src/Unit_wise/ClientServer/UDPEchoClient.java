
package Unit_wise.ClientServer;


import java.io.*;
import java.net.*;

public class UDPEchoClient {
    private static final int SERVER_PORT = 12345;

    public static void main(String[] args) {
        try  {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String message="";
            while (message!= "exit") {
                System.out.print("Enter message (or 'exit' to quit): ");
                message = reader.readLine();
               
                byte[] sendData = message.getBytes();

                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVER_PORT);
                socket.send(sendPacket);

                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                String echoedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Server response: " + echoedMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
