package Unit_wise.InetAddressPrograms;

import java.net.*;
import java.util.*;
public class SpamCheck {
    public static final String BLACKHOLE = "sbl.spamhaus.org";
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter an name or address: ");
        String ipa = inp.next();

        if (isSpammer(ipa)) {
            System.out.println(ipa+ " is a spammer");
        }
        else {
            System.out.println(ipa+ " is not a spammer");}

    }
    private static boolean isSpammer(String arg) {
        try {
            InetAddress address = InetAddress.getByName(arg);
            byte[] quad = address.getAddress();
            String query = BLACKHOLE;
            for (byte octet : quad) {
                int unsignedByte = octet < 0 ? octet + 256 : octet;
                query = unsignedByte + "." + query;
            }
            InetAddress.getByName(query);
            return true;
        } catch (UnknownHostException e) {
            return false;
        }
    }
}
