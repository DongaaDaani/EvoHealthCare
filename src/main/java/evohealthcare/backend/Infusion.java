package evohealthcare.backend;

public class Infusion extends Analog {

	boolean hanging; // Agy fole akaszthato vagy kezre teszik
	double bar;
	boolean flowcontrol;

	public Infusion(String producer, int year, int id, double weight, String material, Size size, int price,
			boolean hanging, double bar, boolean flowcontrol) {
		super(producer, year, true, id, "Infusion", weight, material, size, true, price, 1, false);
		this.hanging = hanging;
		this.bar = bar;
		this.flowcontrol = flowcontrol;

	}

	public boolean isHanging() {
		return hanging;
	}

	public void setHanging(boolean hanging) {
		this.hanging = hanging;
	}

	public double getBar() {
		return bar;
	}

	public void setBar(double bar) {
		this.bar = bar;
	}

	public boolean isFlowcontrol() {
		return flowcontrol;
	}

	public void setFlowcontrol(boolean flowcontrol) {
		this.flowcontrol = flowcontrol;
	}

}
