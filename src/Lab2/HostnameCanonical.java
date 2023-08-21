//wap to find the hostname(canonical name) of the given ip address(8.8.8.8)
package Lab2;
import java.net.*;

public class HostnameCanonical {
    public static void main(String[] args)  {
        try{
        InetAddress addr = InetAddress.getByName("8.8.8.8");
        
        System.out.println(addr.getCanonicalHostName());
    }
        catch(Exception e){
            System.out.println("Error getting hostname:"+e);
        }
    }
}
