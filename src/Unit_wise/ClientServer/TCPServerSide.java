
package Unit_wise.ClientServer;

import java.net.*;
import java.io.*;

public class TCPServerSide {
    public static void main(String[] args) {
         try{
                ServerSocket ss = new ServerSocket(8080);  
                 
                Socket s = ss.accept();
                
                DataInputStream din = new DataInputStream(s.getInputStream());
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());             
                             
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
                String str = " ",str2 = " ";
                
                while(str  !=  "stop "){
                str = din.readUTF(); 
                    System.out.println("Client Says:"+str);
                    System.out.println("Enter message:");
                    str2 = br.readLine();
                    dout.writeUTF(str2);                   
                   
                    dout.flush();    
                   
                }
                din.close();
                s.close();
                ss.close();
         }
         catch(Exception e){
             System.out.println(e);
         }
    }
}
