import java.net.*;
public class MyIPAddress {

    public static void main(String[] args) {
        try{
            InetAddress me = InetAddress.getLocalHost();
            System.out.println(me);
            String dottedQuad = me.getHostAddress();
            System.out.println("My Address is:"+ dottedQuad);
        }
        catch (Exception e){
            System.out.println("Error getting the IP address:"+e);
    }
}
}
