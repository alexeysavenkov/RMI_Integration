package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.function.Function;

import common.Integration;

public class IntegrationImpl extends UnicastRemoteObject implements Integration {

	protected IntegrationImpl() throws RemoteException {
		super();
	}

	@Override
	public double integrate(Function<Double, Double> function, double begin, double end, double step) throws RemoteException {
		double res = 0;
		
		double prevPt = begin;
		double prevVal = function.apply(prevPt);
		for(double pt = prevPt + step; pt < end; pt += step) {
			double newVal = function.apply(pt);
			double avg = (newVal + prevVal) / 2;
			double sqr = avg * step;
			res += sqr;
			prevPt = pt;
			prevVal = newVal;
		}
		
		return res;
	}

}
