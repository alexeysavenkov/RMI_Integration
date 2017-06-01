package functions;

import java.io.Serializable;

public class SquareFunction extends AbstractFunction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	//@Override
	public Double apply(Double x) {
		return x * x;
	}

}
