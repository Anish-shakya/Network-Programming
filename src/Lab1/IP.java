//WAP to print the IP address of your host name usging factorymethod(static)
package Lab1;
import java.net.*;

public class IP {  //created the IP class
    public static void main(String[] args) throws Exception { //Main Method
        
        InetAddress addr =InetAddress.getLocalHost();
        //created object name address
        System.out.println(addr);
//        System.out.println("getAddrss:"+addr.getAddress());
//        System.out.println("gha:"+addr.getHostAddress());
//        System.out.println("ghn:"+addr.getHostName());
//        System.out.println("canonical:"+addr.getCanonicalHostName());
        
        System.out.println(addr); //call the object addr
      
    }
}
