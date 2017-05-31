package server;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;

import common.Constants;
import common.Integration;
import common.RmiInitialization;

public class ServerMain extends RmiInitialization {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		try {
			System.setSecurityManager(new RMISecurityManager());
		 
			Integration integration = new IntegrationImpl();			   		   
			Naming.rebind(Constants.rmiAddress, integration);

			System.out.println("Addition Server is ready.");
		} catch (Exception e) {
		   System.out.println("Addition Server failed: " + e);
		}
	}

}
