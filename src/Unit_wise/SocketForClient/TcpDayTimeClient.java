/*
 Retreiving data from the sever
 */
package Unit_wise.SocketForClient;
import java.net.*;
import java.io.*;

public class TcpDayTimeClient {
    public static void main(String[] args) throws Exception {
       String address= "time.nist.gov";
       int port =13;
       
       Socket socket = new Socket(address,port);
       socket.setSoTimeout(2000);
       InputStream stream = socket.getInputStream();
       InputStreamReader reader = new InputStreamReader(stream, "ASCII");
       
       StringBuilder time = new StringBuilder();
       
       for(int c = reader.read(); c!=-1;c=reader.read()){
            time.append((char) c);
       }
       
        System.out.println("Date-Time :"+time);
    }
}
