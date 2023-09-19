
package Unit_wise.OldQuestions;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
       
        int port = 8020;
        InetAddress address = InetAddress.getByName("localhost");
        
        String number = "13";
        
        DatagramSocket socket = new DatagramSocket();        
        byte[] data = number.getBytes();
        ///sending the number to the server 
        DatagramPacket packet = new DatagramPacket(data,data.length,address,port);
        socket.send(packet);
        
        byte[] receiveData = new byte[1024];
        
        DatagramPacket receive = new DatagramPacket(receiveData,0,receiveData.length);
        socket.receive(receive);
        String message = new String(receive.getData(),0,receive.getLength());
        System.out.println("Server said:"+ message);
        
    }
}
