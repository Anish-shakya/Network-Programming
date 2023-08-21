
package Lab2;

///Wap to display the IP Address and hostname of your Local Machine

import java.net.InetAddress;

public class HostName {
    public static void main(String[] args) {
        try{
            
            InetAddress host =InetAddress.getLocalHost(); //created object name address
        System.out.println(host); //call the object addr
        }
        catch (Exception e){
            System.out.println("Error getting the IP address:"+e);
    }
    }
}
