package server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import common.Constants;
import common.Integration;
import common.RmiInitialization;

public class ServerMain extends RmiInitialization {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		try {
			Registry registry = LocateRegistry.createRegistry(2004);
			
			System.setSecurityManager(new RMISecurityManager());
		 
			Integration integration = new IntegrationImpl();			   		   
			registry.rebind(Constants.rmiAddress, integration);

			System.out.println("Integration Server is ready.");
		} catch (Exception e) {
		   System.out.println("Integration Server failed: " + e);
		}
		
	}

}
