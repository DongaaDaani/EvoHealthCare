package evohealthcare.backend;

import java.util.ArrayList;

public class Hospital {
	private int id;
	private int roomNumber;
	private String name;
	private Size size;
	private ArrayList<Room> rooms = new ArrayList<Room>();
	private Place place;

	public Hospital(int id, int roomNumber, String name, Size size, ArrayList<Room> rooms, Place place) {
		this.id = id;
		this.roomNumber = roomNumber;
		this.name = name;
		this.size = size;
		this.rooms = rooms;
		this.place = place;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	/**
	 * Visszaadja a szobákat.
	 * 
	 * @return szobák
	 */
	public ArrayList<Room> getRooms() {
		return rooms;
	}

	/**
	 * Beállítja a szobákat
	 * 
	 * @param rooms szobák
	 */
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 * Hozzáad egy szobát.
	 * 
	 * @param room szoba
	 */
	public void addRoom(Room room) {
		this.rooms.add(room);
	}

	public void removeRoom(Room room) {
		this.rooms.remove(room);
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", roomNumber=" + roomNumber + ", name=" + name + ", Size=" + size + ", rooms="
				+ rooms + ", Place=" + place + "]";
	}

}
