/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.InetAddressPrograms;

import java.net.InetAddress;


public class Ipv4OrIpv6  {
    public static void main(String[] args) {
       
        try{
        InetAddress address = InetAddress.getByName("www.facebook.com");
        
        if(address instanceof java.net.Inet4Address){
            System.out.println("It is ipv4 Address");
        }
        else if(address instanceof java.net.Inet6Address){
            System.out.println("It is Ipv6 Address");
        }
        else{
            System.out.println("Invalid Ip");
        }
        }
        catch(Exception e){
            System.out.println("Invalid Ip Address");
            System.out.println(e);
        }
    }
}