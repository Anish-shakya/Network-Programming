
package Unit_wise.InetAddressPrograms;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaceExample{
    public static void main(String[] args) throws SocketException {
        Enumeration<NetworkInterface> networkInterface = NetworkInterface.getNetworkInterfaces();
        
        while(networkInterface.hasMoreElements()){
        
        NetworkInterface ni = networkInterface.nextElement();
            System.out.println("Name:"+ni.getName());
            System.out.println("Display Name:"+ni.getDisplayName());
            System.out.println("MTU:"+ni.getMTU());
            System.out.println("Hardware Address:"+ni.getHardwareAddress());
            System.out.println("Is up:"+ni.isUp());
        }
    }
}



