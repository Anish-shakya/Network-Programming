
///WAP in java to print/ retrive the HTTP (common ) header field

package Lab9;
import java.net.*;
import java.io.*;
public class HttpHeader {
    public static void main(String[] args) {
        String UrlStr = args.length>0 ? args[0]: "http://scst.edu.np/academics/computer-application/course-structure";
        //command line argument for url example.com
        
        
        try{
        URL url = new URL(UrlStr);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //created HttpURLConnection object from URL
        
            System.out.println("Request Method:"+connection.getRequestMethod());
            System.out.println("Request Code:"+connection.getResponseCode());
            System.out.println("Request Message:"+connection.getResponseMessage());
            System.out.println("Content Type:"+connection.getContentType());
            System.out.println("Field:"+connection.getHeaderField("Content-Type"));
            System.out.println("Last Modified:"+connection.getLastModified());
            System.out.println("Date:"+connection.getDate());
        }
        catch(Exception e){
        
            System.out.println(e);}
    }
}
