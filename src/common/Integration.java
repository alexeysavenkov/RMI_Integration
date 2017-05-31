package common;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.function.Function;

public interface Integration extends Remote {
	public double integrate(Function<Double, Double> function, double a, double b, double step) throws RemoteException;
}
