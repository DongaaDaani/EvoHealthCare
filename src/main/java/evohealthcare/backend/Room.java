package evohealthcare.backend;

import java.util.ArrayList;

public class Room {

	private int number;
	private Place place;
	private String type;
	private Size size;
	private int beds;
	private ArrayList<Device> devices = new ArrayList<Device>();

	public Room(int number, Place place, String type, Size size, int beds, ArrayList<Device> devices) {
		this.number = number;
		this.place = place;
		this.type = type;
		this.size = size;
		this.beds = beds;
		this.devices = devices;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public ArrayList<Device> getDevices() {
		return devices;
	}

	public void setDevices(ArrayList<Device> devices) {
		this.devices = devices;
	}

	/**
	 * Hozzáad egy eszközt.
	 * 
	 * @param device eszköz
	 */
	public void addDevice(Device device) {
		this.devices.add(device);
	}

	@Override
	public String toString() {
		return "Room [number=" + number + ", Place=" + place + ", type=" + type + ", Size=" + size + ", beds=" + beds
				+ ", rooms=" + devices + "]";
	}

}
