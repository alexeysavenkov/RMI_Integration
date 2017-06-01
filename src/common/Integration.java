package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.function.Function;

import functions.AbstractFunction;
import functions.SquareFunction;

public interface Integration extends Remote {
	public double integrate(/*SquareFunction function, */double a, double b, double step) throws RemoteException;
}
