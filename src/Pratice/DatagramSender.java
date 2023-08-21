import java.net.*;

public class DatagramSender {
    public static void main(String[] args) {
        try {
            String message = "Hello, World!";
            byte[] data = message.getBytes();
            InetAddress destinationAddress = InetAddress.getByName("192.168.0.100");
            int destinationPort = 12345;

            DatagramPacket packet = new DatagramPacket(data, data.length, destinationAddress, destinationPort);

            DatagramSocket socket = new DatagramSocket();
            socket.send(packet);

            System.out.println("Datagram packet sent successfully.");
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
