
//WAP to guess the MIME Mecha 
package Lab10;
import java.net.*;
import java.io.*;

public class GuessContentType {
    
    GuessContentType(){
    try{
    String fileName = "example.html";
    String contentType = URLConnection.guessContentTypeFromName(fileName);
        System.out.println("content Type:"+contentType);
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
    
    
    
    public static void main(String[] args) {
        GuessContentType c1= new GuessContentType();
    }
}
