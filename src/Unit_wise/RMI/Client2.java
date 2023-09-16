/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.RMI;

import java.rmi.Naming;

public class Client2{
public static void main(String[] args){
	try{
	RemoteInterface remoteInterface = (RemoteInterface) Naming.lookup("rmi://localhost/RemoteCalculator");
	int a = 5;
	int b = 5;
	int fact = 10;
	System.out.println("Sum:"+remoteInterface.Sum(a,b));
	System.out.println("Factorial:"+remoteInterface.Factorial(fact));
	}
	catch(Exception e){
	System.out.println(e);
	}
}
}