///wap that www.ibilio.org and helio.ibilio.org are same by creating the object for them
package Lab2;
import java.net.InetAddress;

public class SameIPCheck  {
    public static void main(String[] args) {
        try{
            InetAddress obj = InetAddress.getByName("www.ibilio.org"); //get Ip and host name
            InetAddress obj2 = InetAddress.getByName("helios.ibilio.org"); //get Ip and host name
            
            System.out.println(obj);
            System.out.println(obj2);
            
            System.out.println("\n");
            if(obj.equals(obj2)){ //check if obj equals obj2
                System.out.println("www.ibilio.org is the same as helios.ibilio.org");
            }
            else{
                System.out.println("Not the same");
            }
        }
        catch(Exception e){
            System.out.println("Error occured:"+e);
        }
    }
}
