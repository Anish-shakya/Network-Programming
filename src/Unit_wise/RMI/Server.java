/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.RMI;

import java.rmi.registry.LocateRegistry;
import java.rmi.Naming;
public class Server{
public static void main(String[] args){
	
	try{
            RemoteInterface remoteInterface = new RemoteInterfaceImpl();
            LocateRegistry.createRegistry(1099);
            Naming.bind("RemoteCalculator",remoteInterface);
            System.out.println("Server is ready to serve...");
	}        
	catch(Exception e){
	System.out.println(e);
	}
}
}