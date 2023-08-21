/*
WAP to display socket information [address, port, local address, local port].
 */
package Unit6;
import java.net.*;
import java.io.*;
public class SocketInfo {
public static void main(String[] args) {
try {
Socket toSocket = new Socket("www.example.com", 80);
// created a new Socket object(toSocket) and connected to www.example.com on port 80.
//connected to a fixed host and port so doesnt need any Command line argument
System.out.println("Connected to " + toSocket.getInetAddress() +
" on port " + toSocket.getPort() +
" from port "+ toSocket.getLocalPort() +
" of "+ toSocket.getLocalAddress());
} catch (IOException ex) {
System.err.println(ex);

}
}
}
 
