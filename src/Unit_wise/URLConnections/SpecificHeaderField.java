/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.URLConnections;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author shaky
 */
public class SpecificHeaderField {
    public static void main(String[] args) throws MalformedURLException,IOException{
        URL url = new URL ("https://shakyaanish.com.np");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        
        System.out.println("Request Method:"+con.getRequestMethod());
         System.out.println("Request Code = " + con.getResponseCode());
        System.out.println("Request Message = " + con.getResponseMessage());
        System.out.println("Content Length = "+con.getContentLength());
        System.out.println("Content Type = "+con.getContentType());
        System.out.println("Content Encoding = " +con.getContentEncoding());
        System.out.println("Last Modified = "+new java.util.Date(con.getLastModified()));
        System.out.println("Date = "+new java.util.Date(con.getDate()));
        System.out.println("Expiration = " + new java.util.Date(con.getExpiration()));
        
    }
}
