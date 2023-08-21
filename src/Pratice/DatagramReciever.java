import java.net.*;

public class DatagramReciever {
    public static void main(String[] args) {
        try {
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            DatagramSocket socket = new DatagramSocket(12345); // Specify the port to listen on
            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received message: " + message);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
