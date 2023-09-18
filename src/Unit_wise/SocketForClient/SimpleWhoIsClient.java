/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.SocketForClient;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class SimpleWhoIsClient {
    public static void main(String[] args) throws Exception {
        String domain = "example.com"; // Replace with the domain you want to look up
        String whoisServer = "whois.verisign-grs.com"; // Replace with the appropriate Whois server

            Socket socket = new Socket(whoisServer, 43);
            OutputStream outStream  = socket.getOutputStream();
            PrintWriter out = new PrintWriter(outStream, true);
            InputStream inStream = socket.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inStream));            

            out.println(domain);
            String line;
            
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
    }
}
