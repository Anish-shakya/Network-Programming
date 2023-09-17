/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.URLConnections;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class ArbitaryHeader  {
    
    public static void main(String[] args) throws Exception {
         URL url = new URL("https://www.example.com");
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        ///getHeaderField()
        System.out.println("Content-type:"+conn.getHeaderField("content-type"));
        System.out.println("Content-length" + conn.getHeaderField("content-lenght"));
        System.out.println("Date:"+conn.getHeaderField("date"));
        
        ///getHeaderFieldKey()
        System.out.println(conn.getHeaderFieldKey(2)+ ":" +conn.getHeaderField(2));
        System.out.println(conn.getHeaderFieldKey(3)+":"+conn.getHeaderField(3));
        System.out.println(conn.getHeaderFieldKey(4)+ ":" +conn.getHeaderField(4));
        System.out.println(conn.getHeaderFieldKey(5)+ ":" +conn.getHeaderField(5));
        
        //getHeaderFieldDate()
       Date date = new Date(conn.getHeaderFieldDate("date", 0));
       Date date2 = new Date(conn.getHeaderFieldDate("last-modified", 0));
       Date date3 = new Date(conn.getHeaderFieldDate("expiration", 0));
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date3);
        
        ///getHeaderFieldInt
        System.out.println(conn.getHeaderFieldInt("content-length",0));
        
        
        System.out.println("############################################");
        System.out.println("Retriving all header");
        for(int i=1; ;i++){
        String HeaderName = conn.getHeaderFieldKey(i);
        String HeaderValue = conn.getHeaderField(i);
        
        if(HeaderName != null && HeaderValue != null){
            System.out.println(HeaderName +":"+HeaderValue);
        }
        
        }
    }
  
}
