
package Lab13;

import java.net.*;
import java.io.*;

public class ServerSide {
    public static void main(String[] args) {
         try{
                ServerSocket ss = new ServerSocket(8080);  //ceating the SeverSocket object ss 
                 
                Socket s = ss.accept();
                
                DataInputStream din = new DataInputStream(s.getInputStream());
                /*getInputStream This method returns an InputStream 
                representing the data and throws the appropriate exception if it can not do so.*/
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());
                
                 /*getOutptstream This method returns an OutputStream 
                representing the data and throws the appropriate exception if it can not do so.*/
                
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                /*BufferedReader is a class which simplifies reading text from a character input stream     */
                String str = " ",str2 = " ";
                
                while(str  !=  "stop "){
                str = din.readUTF(); 
                /*readUTF is the method of the DataInputStream class read a string 
                that has been encoded using a modified UTF-8 format and returned a string.*/
                
                    System.out.println("Client Says:"+str);
                    System.out.println("Enter message:");
                    str2 = br.readLine();
                    dout.writeUTF(str2);
                    
                    /* writeUTF is the methd of the  DataOutputStream class writes  a string 
                that has been encoded using a modified UTF-8 format and returned a string.    */
                    dout.flush();    
                    /*The flush() method of OutputStream class is used to flush the content of the buffer to the output stream.*/
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
