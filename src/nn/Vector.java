package nn;

import java.util.ArrayList;
import java.util.Random;

public class Vector extends ArrayList<Double> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7523098622549431793L;
	
	public Vector(){
		super();
	}

	public double dot(Vector other) throws Exception {
		if(this.size() != other.size()) {
			throw new Exception("Dot product should have same size vectors.");
		}
		double res = 0.0;
		for(int i = 0; i < this.size(); i++) {
			res += this.get(i)*other.get(i);
		}
		return res;
	}
	
	public void initialize(int amtIndices) {
		Random r = new Random();
		for(int i = 0; i < amtIndices; i++) {
			this.set(i, 2*r.nextDouble() - 1.0);
		}
	}
}
