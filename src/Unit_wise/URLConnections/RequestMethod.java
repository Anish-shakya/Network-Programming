/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.URLConnections;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class RequestMethod {
    public static void main(String[] args) throws Exception {
          URL url = new URL("https://shakyaanish.com.np");
    
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        
        ///we can use GET , POST , DELETE , TRACE , PUT , HEAD
        http.setRequestMethod("HEAD");
        
        System.out.println(http.getRequestMethod());
        System.out.println(http.getResponseCode());
        System.out.println(new Date(http.getLastModified()));
              
        
    }
  
}
