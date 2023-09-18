/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.SocketForSever;
import java.net.*;

public class LocalPortScanning {
    public static void main(String[] args) {
        int port = 0;
        try{
        for(port = 1; port<=65535;port++){
            ServerSocket ss = new ServerSocket(port);
            System.out.println("running"+port);
        }
        }catch(Exception e){
            System.out.println("There is server on port"+ port);
        }
    }
 
}
