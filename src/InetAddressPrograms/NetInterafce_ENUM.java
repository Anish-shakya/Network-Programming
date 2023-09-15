package InetAddressPrograms;


import java.net.*;
import java.util.*;
public class NetInterafce_ENUM {
    public static void main(String[] args) throws SocketException {
        Enumeration interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            System.out.println(interfaces.nextElement());
        }
    }
}
