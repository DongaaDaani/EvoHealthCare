package evohealthcare.backend;

public class Digital extends Device {
	private String screen;
	private Software software;

	public Digital(String producer, int year, boolean waste, int id, String type, double weight, String material,
			Size size, boolean move, int price, String screen, Software software) {
		super(producer, year, waste, id, type, weight, material, size, move, price);
		this.screen = screen;
		this.software = software;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	@Override
	public String toString() {
		return "Digital [screen=" + screen + ", software=" + software + "]";
	}

}
