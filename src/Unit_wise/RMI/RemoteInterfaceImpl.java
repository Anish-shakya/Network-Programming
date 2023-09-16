/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit_wise.RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteInterfaceImpl extends UnicastRemoteObject implements RemoteInterface{
		public RemoteInterfaceImpl() throws RemoteException{
		//default constructor
		}

@Override
	public int Sum(int a,int b) throws RemoteException{
		return a+b;
	}
@Override
	public int Factorial(int a) throws RemoteException{
		if(a<0){
			throw new RemoteException("Negative number");
		}
		if(a==0||a==1){
			return 1;
		}
		else{
			return a*Factorial(a-1);
		}
	}
}