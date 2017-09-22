package nn;

import java.util.List;
import java.util.Random;

public class Perceptron {
	private int row;
	private int index;
	private Vector weights;
	private double initialVal;
	private List<Perceptron> next;
	private Vector features;
	
	public Perceptron(int _row, int _index, int amtIndices, List<Perceptron> _next) {
		this.row = _row;
		this.index = _index;
		this.weights = new Vector();
		weights.initialize(amtIndices);
		initialVal = 2*(new Random()).nextDouble() - 1.0;
		this.next = _next;
		features = new Vector();
	}
	
	public int getRow() {
		return row;
	}

	public int getIndex() {
		return index;
	}
	
	public void receive(Message m) {
		
	}
}
