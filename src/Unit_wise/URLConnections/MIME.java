/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.URLConnections;

import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author shaky
 */
public class MIME {
    public static void main(String[] args) throws Exception{        
        System.out.println(URLConnection.guessContentTypeFromName("text.html"));
        System.out.println(URLConnection.guessContentTypeFromName("text.mp4"));
        System.out.println(URLConnection.guessContentTypeFromName("text.jpg"));
        System.out.println(URLConnection.guessContentTypeFromName("text.png"));
        System.out.println(URLConnection.guessContentTypeFromName("text.xml"));
        
    }
}
