/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamPratice;

import java.net.*;
public class InetAddressPratice {
    public static void main(String[] args) throws Exception {
        String url = "shakyaanish.com.np";
        
        InetAddress address = InetAddress.getByName(url);
        InetAddress addr2 = InetAddress.getByName("8.8.8.8");
        InetAddress addr = InetAddress.getLocalHost();
        
        System.out.println("Host Name and Address:"+addr);
        System.out.println(addr2.getCanonicalHostName());
        System.out.println("Host Name:"+addr.getHostName());
        System.out.println("Host Ip address"+addr.getHostAddress());
        System.out.println("Raw Ip Address:"+addr.getAddress());
        System.out.println("Host Address text form:"+addr.getHostAddress());
        System.out.println(address);
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
        System.out.println(address.getAddress());
    }
 
}
