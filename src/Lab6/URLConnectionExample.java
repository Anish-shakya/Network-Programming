/* WAP in java that connect to a url ("https://www.example.com") and retrive data from it using 
openCommand() and getInputSteam() Method*/
package Lab6;
import java.net.*;
import java.io.*;
 
public class URLConnectionExample  {
    public static void main(String[] args) {
        try{
        URL url = new URL("https://www.example.com");
        /*create the url object that access URL www.example.com*/
        URLConnection connection = url.openConnection();
        /*URLConnection object created named connection by using openConnection method*/
        
        InputStream stream = connection.getInputStream();
        /*Retrive a input Stream from the connection using getInputStream method
        which used to read data from the URLConnection*/
        
        BufferedReader reader= new BufferedReader(new InputStreamReader(stream));
        
        /*Created buffered Reader object--> reader, to read data from the line input stream * */
        
        String line;
        /*declare a variable name line type string*/
        
        while((line = reader.readLine())!=null){
            /*Read line from the file intile there are no more lines*/
            
            System.out.println(line); /*print each line*/
        }
        reader.close();/*close the buffered reader to release resources*/
        
        
    }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
