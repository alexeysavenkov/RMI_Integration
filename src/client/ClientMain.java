package client;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.util.function.Function;

import common.*;

public class ClientMain extends RmiInitialization {

	public static void main(String[] args) {
		Integration integration;
		try {
	        System.setSecurityManager(new RMISecurityManager());
			integration = (Integration)Naming.lookup(Constants.rmiAddress);
			double result = integration.integrate(x -> x*x, 0, 10, 0.5);
			System.out.println("Result is :" + result);
		} catch (Exception e) {
			System.out.println("HelloClient exception: " + e);
		}
	}

}
