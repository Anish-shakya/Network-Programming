
package Lab13;
import java.net.*;

public class DatagramPacketSender {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        
        String str = "Hello this is Datagram Packet";
        
        DatagramPacket dp  = new DatagramPacket(str.getBytes(),str.length(),InetAddress.getByName("127.0.0.1"),1234);
        ds.send(dp);
        ds.close();
        
    }
}
