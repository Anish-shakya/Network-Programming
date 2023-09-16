/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.InetAddressPrograms;

import java.net.InetAddress;

public class AddressTypes {
    public static void main(String[] args) {
        try{
        
        String url ="www.shakyaanish.com.np";
        InetAddress addr = InetAddress.getByName(url);
        
       if(addr.isAnyLocalAddress()){
           System.out.println("It is Local Address");
       }
       if(addr.isLoopbackAddress()){
           System.out.println("It is loop back address");
       }
       
       if(addr.isLinkLocalAddress()){
           System.out.println("It is Link local address");
       }
       else if(addr.isSiteLocalAddress()){
           System.out.println("It is site local address");
       }
       else{
           System.out.println("It is global address");
       }
       
       ///multicast check
       if(addr.isMulticastAddress()){
       
       if(addr.isMCGlobal()){
           System.out.println("It is Multicast Global address");
       }
       else if(addr.isMCOrgLocal()){
           System.out.println("It is Organizational wise multicast address");
       }
       else if(addr.isMCLinkLocal()){
           System.out.println("It is Multicast Link local");
       }
       else if (addr.isMCSiteLocal()){
           System.out.println("It is multcast site Local");
       }
       else{
           System.out.println("No specific multicast address");
       }
       }
       else{
           System.out.println("It is unicast address");
       }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
