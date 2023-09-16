package Unit_wise.InetAddressPrograms;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class Gname {

        public static void main(String[] args)  throws UnknownHostException{
           InetAddress add1 = InetAddress.getByName("www.google.com");
            System.out.println("The Host IP is: " + add1);

            System.out.println("The Host name is: " +add1.getHostName());

            InetAddress[] ad2 = InetAddress.getAllByName("www.facebook.com");
            System.out.println("The multiple IP's are: ");
            for (InetAddress address: ad2){
                System.out.println(address);
            }

            InetAddress my = InetAddress.getLocalHost();
            System.out.println("My Local Host name is: " +my);

            byte addr[] ={107,23,(byte)216,(byte)196};
            InetAddress iponly = InetAddress.getByAddress(addr);
            System.out.println("The object with IP only is: " +iponly);

            InetAddress ipwithname = InetAddress.getByAddress("www.abc.com", addr);
            System.out.println("The object with Host name and IP is: " +ipwithname);
        }
    }
