
package Unit_wise.ClientServer.Multithread;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPMultithreadClient extends Thread {
    public void run() {
        try{
        Socket s = new Socket("localhost", 8080);
        
        DataInputStream din = new DataInputStream(s.getInputStream());
        
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        //sends output to the socket
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "", str2 = " ";
        
        while(!str.equals("stop")){
            System.out.println("Enter Response: ");
            str = br.readLine();
            dout.writeUTF(str); 
            dout.flush();
            System.out.println("Waiting for server reply");
            str2 = din.readUTF();
            System.out.println("Server Says : "+str2);
        }
        dout.close();
        din.close();
        s.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Thread tcp = new TCPMultithreadClient();
        tcp.start();
    }
}
