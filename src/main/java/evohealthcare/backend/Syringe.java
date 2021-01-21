package evohealthcare.backend;

public class Syringe extends Analog {

	double millimeter;
	int wrapping;

	public Syringe(String producer, int year, int id, double weight, Size size, int price, double millimeter,
			int wrapping) {
		super(producer, year, true, id, "Syringe", weight, "Plastic", size, true, price, 1, true);
		this.millimeter = millimeter;
		this.wrapping = wrapping;
	}

	public double getMillimeter() {
		return millimeter;
	}

	public void setMillimeter(double millimeter) {
		this.millimeter = millimeter;
	}

	public int getWrapping() {
		return wrapping;
	}

	public void setWrapping(int wrapping) {
		this.wrapping = wrapping;
	}

}
