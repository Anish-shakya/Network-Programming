/* WAP in java that connect to a url ("https://www.example.com") and retrive data from it using 
openCommand() and getInputSteam() Method*/
package Lab11;
import java.net.*;
import java.io.*;
 
public class HttpUrlConnection  {
    public static void main(String[] args) {
        try{
        URL url = new URL("https://www.example.com");
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
        
        InputStream stream = http.getInputStream();
        
        BufferedReader reader= new BufferedReader(new InputStreamReader(stream));
        
        
        String line;
        
        while((line = reader.readLine())!=null){
            
            System.out.println(line); /*print each line*/
        }
        reader.close();/*close the buffered reader to release resources*/
        
        
    }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
