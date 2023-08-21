///Port Scanner Program
package Lab14;
import java.net.*;
import java.io.*;
public class PortScanner {
    public static void main(String[] args) {
        String host = "localhost";
        for(int port = 1024;port< 1035 ;port++){
        
        try{
                ServerSocket server = new ServerSocket(port);
                System.out.println("There s a server on port:"+port);
                server.close();
        }
        catch(Exception e){
            System.out.println("Error Occured:"+e);
        }
        }
        }
    }

