/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.Url_and_URI;

import java.net.*;
public class URLDemo {
    public static void main(String[] args) throws Exception {
        String url = "https://admin@www.example.com:443/anything/thispage.html?param1= value1#here";
//        URI uri = new URI(url);
        
        URI uri1 = new URI("http","example.com:400/index/index.html/value1=value2","here");
        System.out.println(uri1);
        
        URI uri2 = new URI("http","user:password","www.example.com",400,"/index/index.html","value1=value2","here");
        System.out.println(uri2);
        
        URI uri3 = new URI("http","www.example.com","/index/index.html","here");
        System.out.println(uri3);
        
        URI uri4 = new URI("http","user:pass@www.example.com:400","/index/index.html","value1=value2","here");
        System.out.println(uri4);
        
        System.out.println("Scheme:"+uri4.getScheme());
        System.out.println("SSP:"+uri4.getSchemeSpecificPart());
         System.out.println("Raw SSP:"+uri4.getRawSchemeSpecificPart());
        System.out.println("Fragment:"+uri4.getFragment());
        System.out.println("RawFragment:"+uri4.getRawFragment());
        System.out.println("Host:"+uri4.getHost());
        System.out.println("User-info:"+uri4.getUserInfo());
        System.out.println("Raw     User-info:"+uri4.getRawUserInfo());
        
        System.out.println("Authority:"+uri4.getAuthority());
        System.out.println("Raw Authority:"+uri4.getRawAuthority());
        
        System.out.println("Is opaque:"+uri4.isOpaque());
        System.out.println("Is Absolute:"+uri4.isAbsolute());
        
        
        System.out.println("Is Opaque:"+uri1.isOpaque());
       
    }   
        
}
