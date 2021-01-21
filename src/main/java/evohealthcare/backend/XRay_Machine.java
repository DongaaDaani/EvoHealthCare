package evohealthcare.backend;

public class XRay_Machine extends Digital {

	int memory; // lemezterület pl 190 kép.
	double consumption; // fogyasztas
	String picdetail; // pl : 500x500x900 px

	public XRay_Machine(String producer, int year, boolean waste, int id, String type, double weight, int count,
			Size size, boolean move, int price, String screen, Software software, int memory, double consumption,
			String picdetail) {
		super(producer, year, false, id, "X Ray Machine", weight, "iron ", size, true, price, screen, software);
		this.memory = memory;
		this.consumption = consumption;
		this.picdetail = picdetail;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public double getConsumption() {
		return consumption;
	}

	public void setConsumption(double consumption) {
		this.consumption = consumption;
	}

	public String getPicdetail() {
		return picdetail;
	}

	public void setPicdetail(String picdetail) {
		this.picdetail = picdetail;
	}

}
