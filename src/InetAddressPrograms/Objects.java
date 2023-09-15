package InetAddressPrograms;

import java.net.*;
public class Objects {
    public static void main(String[] args) throws  UnknownHostException{
        InetAddress ad1 = InetAddress.getByName("www.fb.com");
        InetAddress ad2 = InetAddress.getByName("www.facebook.com");

        if(ad1.equals(ad2)){
            System.out.println("Both domain are same. ");
        }
        else{
            System.out.println("The IP's are not same. ");
        }

    }
}
