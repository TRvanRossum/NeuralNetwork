package nn;

public class Message {
	private int index;
	private double value;
	
	public Message(int _i, double _v) {
		index = _i;
		value = _v;
	}

	public int getIndex() {
		return index;
	}

	public double getValue() {
		return value;
	}
}
