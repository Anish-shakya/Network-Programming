//wap to display the socket info(address,port,local address,local port
package Lab15;
import java.net.*;
import java.io.*;
public class SocketInfo {
    public static void main(String[] args) throws Exception {
        String host = "example.com";
        try{
            Socket soc = new Socket(host,80);
            System.out.println("\n Connected to:"+soc.getInetAddress() +
                    "\n on port:"+soc.getPort()+"\n From port:"+soc.getLocalPort()+"\n of address:"+soc.getLocalAddress());
        }
        catch(IOException e){
            System.err.println("\n cannot find" +host);
            Socket EX;
        
        }
    }
    
}