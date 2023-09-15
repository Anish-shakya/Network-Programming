package InetAddressPrograms;

import java.net.*;
public class NetInterface {
    public static void main(String[] args) {

        try {
            NetworkInterface ni = NetworkInterface.getByName("wlan0");
            if (ni == null) {
                System.err.println("No such interface!!");
            }
            else{
                System.out.println("The Interface is: " +ni);
            }
        } catch (SocketException ex) {
            System.err.println("Could not list sockets.");
        }
    }
}
