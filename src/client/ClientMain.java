package client;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.function.Function;

import common.*;
import functions.SquareFunction;

public class ClientMain extends RmiInitialization {

	public static void main(String[] args) {
		Integration integration;
		try {
			Registry registry = LocateRegistry.getRegistry(Constants.rmiPort);
	        System.setSecurityManager(new RMISecurityManager());
			integration = (Integration)registry.lookup(Constants.rmiAddress);
			double result = integration.integrate(/*new SquareFunction(), */0, 10, 0.1);
			System.out.println("Result is :" + result);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

}
