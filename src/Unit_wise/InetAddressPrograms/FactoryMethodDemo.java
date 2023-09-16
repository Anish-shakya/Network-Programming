/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.InetAddressPrograms;

import java.net.InetAddress;


public class FactoryMethodDemo {
    public static void main(String[] args) {
        String address = "www.facebook.com";
        try{
                   //factory methods
        InetAddress local = InetAddress.getLocalHost(); 
            System.out.println("Local Host:"+local);
            
        InetAddress addr = InetAddress.getByName(address);              
            System.out.println("Hostname and Ip:"+addr);
            
         InetAddress addr2[] = InetAddress.getAllByName(address);
         for(int i=0;i<addr2.length;i++){
             System.out.println("All address:"+addr2[i]);
         }
         
         byte add[]={127,0,0,1};
         InetAddress addr3 = InetAddress.getByAddress(add);
            System.out.println("Ip:"+addr3);
            
         InetAddress addr4 = InetAddress.getByAddress(address,add);
            System.out.println(addr4);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
