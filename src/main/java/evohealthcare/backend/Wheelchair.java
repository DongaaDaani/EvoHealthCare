package evohealthcare.backend;

public class Wheelchair extends Analog {

	boolean headrest; // fejtámla
	boolean automatic;
	int chargeable; // terhelhetőség

	public Wheelchair(String producer, int year, boolean waste, int id, String type, double weight, Size size,
			boolean moove, int price, int lifetimeOccasion, boolean sharp, boolean headrest, boolean automatic,
			int chargeable) {
		super(producer, year, false, id, "wheel Char", weight, "iron", size, true, price, lifetimeOccasion, false);
		this.headrest = headrest;
		this.automatic = automatic;
		this.chargeable = chargeable;
	}

	public boolean isHeadrest() {
		return headrest;
	}

	public void setHeadrest(boolean headrest) {
		this.headrest = headrest;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	public int getChargeable() {
		return chargeable;
	}

	public void setChargeable(int chargeable) {
		this.chargeable = chargeable;
	}

}
