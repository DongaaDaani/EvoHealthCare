package evohealthcare.backend;

public class Place {
	private int x;
	private int y;

	public Place(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String toString() {
		return "x = " + x + " y = " + y;
	}
}
