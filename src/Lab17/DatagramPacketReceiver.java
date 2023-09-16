
package Lab17;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramPacketReceiver {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket and bind it to a specific port
            DatagramSocket socket = new DatagramSocket(12345);

            // Create a buffer to store received data
            byte[] receiveData = new byte[1024];


            // Create a DatagramPacket to receive the data
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            // Receive the packet
            socket.receive(receivePacket);

            // Extract the received message
            String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            int port = receivePacket.getPort();
            System.out.println(port);
            System.out.println("Received message: " + receivedMessage);

            // Close the socket
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
