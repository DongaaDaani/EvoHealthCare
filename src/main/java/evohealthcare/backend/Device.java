package evohealthcare.backend;

public class Device {

	private String producer;
	private int year;
	private boolean waste;
	private int id;
	private String type;
	private double weight;
	private String material;
	private Size size;
	private boolean move;
	private int price;

	/**
	 * Létrehoz egy eszközt az összes adattagjának megadásával.
	 * 
	 * @param producer Az eszköz gyártójának neve.
	 * @param year     Az eszköz gyártási éve.
	 * @param waste    Az eszköz eldobhatósága.
	 * @param id       Az eszköz azonosítója.
	 * @param type     Az eszköz tipusa.
	 * @param weight   Az eszköz súlya.
	 * @param material Az eszköz anyaga.
	 * @param size     Az eszköz mérete.
	 * @param move     Az eszköz hordozhatósága.
	 * @param price    Az eszköz ára.
	 */
	public Device(String producer, int year, boolean waste, int id, String type, double weight, String material,
			Size size, boolean move, int price) {
		this.producer = producer;
		this.year = year;
		this.waste = waste;
		this.id = id;
		this.type = type;
		this.weight = weight;
		this.material = material;
		this.size = size;
		this.move = move;
		this.price = price;
	}

	/**
	 * Visszaadja az eszköz gyártóját.
	 * 
	 * @return gyártó
	 */
	public String getProducer() {
		return producer;
	}

	/**
	 * Beállítja az eszköz gyártóját.
	 * 
	 * @param producer Az eszköz gyártója.
	 */
	public void setProducer(String producer) {
		this.producer = producer;
	}

	/**
	 * Visszaadja az eszköz gyártási évét.
	 * 
	 * @return gyártási év
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Beállítja az eszköz
	 * 
	 * @param year Az eszköz gyártási éve.
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isWaste() {
		return waste;
	}

	/**
	 * Beállítja az eszköz
	 * 
	 * @param waste
	 */
	public void setWaste(boolean waste) {
		this.waste = waste;
	}

	/**
	 * Visszaadja az eszköz
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * Beállítja az eszköz
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Visszaadja az eszköz
	 * 
	 * @return
	 */
	public String getType() {
		return type;
	}

	/**
	 * Beállítja az eszköz
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Visszaadja az eszköz
	 * 
	 * @return
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * Beállítja az eszköz
	 * 
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Visszaadja az eszköz
	 * 
	 * @return
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * Beállítja az eszköz
	 * 
	 * @param material
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * Visszaadja az eszköz
	 * 
	 * @return
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * Beállítja az eszköz
	 * 
	 * @param size
	 */
	public void setSize(Size size) {
		this.size = size;
	}

	/**
	 * 
	 * @return
	 */
	public boolean isMove() {
		return move;
	}

	/**
	 * Beállítja az eszköz
	 * 
	 * @param moove
	 */
	public void setMove(boolean moove) {
		this.move = moove;
	}

	/**
	 * Visszaadja az eszköz
	 * 
	 * @return
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * Beállítja az eszköz
	 * 
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Device [producer=" + producer + ", year=" + year + ", waste=" + waste + ", ID=" + id + ", type=" + type
				+ ", weight=" + weight + ", material=" + material + ", Size=" + size + ", mooveing : " + move
				+ ", Price = " + price + "]";
	}

}
