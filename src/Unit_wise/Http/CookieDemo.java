/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.Http;

import java.net.*;
import java.util.List;
public class CookieDemo {
    public static void main(String[] args) {
        CookieManager manager = new CookieManager();
        //CookieHandler.setDefault(manager);
        CookieStore store = manager.getCookieStore();
        
        HttpCookie cookie1 = new HttpCookie("Cookie1","c1");
        HttpCookie cookie2 = new HttpCookie("Cookie2","c2");
        HttpCookie cookie3 = new HttpCookie("Cookie3","c3");
        HttpCookie cookie4 = new HttpCookie("Cookie4","c4");
        
        
        URI uri1 = URI.create("http://www.example.com:30/anything/index.html");
     
        store.add(uri1,cookie1);
        store.add(uri1,cookie2);
        store.add(uri1,cookie3);
        
       List<HttpCookie> cookiess = store.get(uri1);
       
            for (HttpCookie cookie : cookiess) {
                System.out.println("Name: " + cookie.getName());
                System.out.println("Value: " + cookie.getValue());
                System.out.println("Domain: " + cookie.getDomain());
                System.out.println("Path: " + cookie.getPath());
                System.out.println("Expires: " + cookie.getMaxAge() + " seconds");
                System.out.println("Secure: " + cookie.getSecure());
                System.out.println("HttpOnly: " + cookie.isHttpOnly());
                System.out.println("---------");
            };        
    }
}
