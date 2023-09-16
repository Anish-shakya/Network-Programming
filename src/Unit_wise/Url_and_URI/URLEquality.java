//WAP to check https://www.example.com and http://example.com are equal or not
package Unit_wise.Url_and_URI;

import java.net.*;

public class URLEquality {
    public static void main(String[] args) {
        try{
       URL url1 = new URL("https://www.example.com"); //creating url1 object
       URL url2 = new URL("https://example.com");// creating url2 object
       
       if(url1.equals(url2)){ // checking if the url1 and url2 is equal or nor using equals() method
           System.out.println(url1+" is same as "+url2);  //output if TRUE
       }
       else{
           System.out.println(url1+"is not same as"+url2); // output if FALSE
       }
        
        }
        catch(MalformedURLException  e){
            System.out.println(e);
        }
        
        
        ///using http and https and checking if equal or not
         try{
       URL url1 = new URL("http://www.example.com"); //creating url1 object
       URL url2 = new URL("https://example.com");// creating url2 object
       
       if(url1.equals(url2)){ // checking if the url1 and url2 is equal or nor using equals() method
           System.out.println(url1+" is same as "+url2);  //output if TRUE
       }
       else{
           System.out.println(url1+" is not same as "+url2); // output if FALSE
       }
        
        }
        catch(MalformedURLException  e){
            System.out.println(e);
        }
    }
}
