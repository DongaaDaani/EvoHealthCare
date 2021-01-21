package evohealthcare.backend;

import java.util.ArrayList;
import java.util.Scanner;

public class InMemoryHospitalService implements HospitalService {
	ArrayList<Hospital> hospitals = new ArrayList<Hospital>();

	public void addRoom(Hospital hospital, Room room) {
		for (Hospital h : hospitals) {
			if (h.getId() == hospital.getId()) {
				h.addRoom(room);
				return;
			}

		}

	}

	public ArrayList<Hospital> inputReader(int szam) {

		Scanner beolvas = new Scanner(System.in);

		for (int i = 0; i < szam; i++) {

			System.out.println("How many Room are there:");
			int roomNumber = beolvas.nextInt();

			System.out.println("Name Of hospital:");
			String name = beolvas.nextLine();

			beolvas.nextLine();
			System.out.println("Hospital id:");
			int id = beolvas.nextInt();
			System.out.println("Parameter of Hospital:");
			System.out.println("Lenght:");
			int lenght = beolvas.nextInt();
			System.out.println("widht:");
			int width = beolvas.nextInt();
			System.out.println("height:");
			int height = beolvas.nextInt();
			Size size = new Size(lenght, height, width);
			beolvas.nextLine();
			System.out.println("Place X koordinate:");
			int x = beolvas.nextInt();
			System.out.println("Place Y koordinate:");
			int y = beolvas.nextInt();
			Place hospitalPlace = new Place(x, y);

			ArrayList<Room> rooms = new ArrayList<Room>();
			for (int j = 0; j < roomNumber; j++) {
				System.out.println("Room number:");
				int szobaszam = beolvas.nextInt();
				beolvas.nextLine();
				System.out.println("Type of " + (j + 1) + " room");
				String type = beolvas.nextLine();
				System.out.println("how many beds in the room?");
				int beds = beolvas.nextInt();

				System.out.println("Parameters of room");
				System.out.println("Width:");
				int szelesseg = beolvas.nextInt();
				System.out.println("Height:");
				int magassag = beolvas.nextInt();
				System.out.println("Lenght:");
				int hosszusag = beolvas.nextInt();
				Size meret = new Size(szelesseg, magassag, hosszusag);

				System.out.println("Room X koordináta:");
				int roomX = beolvas.nextInt();
				System.out.println("Room Y koordináta:");
				int roomY = beolvas.nextInt();
				Place roomPlace = new Place(roomX, roomY);

				System.out.println("How many deviceses are in the room?");
				int deviveses = beolvas.nextInt();

				ArrayList<Device> device = new ArrayList<Device>();
				for (int k = 0; k < deviveses; k++) {
					beolvas.nextLine();
					System.out.println("Name of devices:");
					String devicename = beolvas.nextLine();
					System.out.println("Procuder:");
					String producer = beolvas.nextLine();
					System.out.println("Make year (melyik evbe gyartottak):");
					int year = beolvas.nextInt();
					System.out.println("Device weight:");
					int weight = beolvas.nextInt();
					System.out.println("Device Price:");
					int price = beolvas.nextInt();
					beolvas.nextLine();

					System.out.println("Eldobható?");
					Boolean waste;

					char answer = beolvas.next().charAt(0);

					if (answer == 'i') {
						waste = true;
					} else
						waste = false;
					beolvas.nextLine();
					System.out.println("Material:");
					String material = beolvas.nextLine();
					System.out.println("Device id:");
					int deviceID = beolvas.nextInt();

					System.out.println("width device:");
					int szelessegdevice = beolvas.nextInt();
					System.out.println("height device:");
					int magassagdevice = beolvas.nextInt();
					System.out.println("lenght device:");
					int hosszusagdevice = beolvas.nextInt();
					Size meretdevice = new Size(szelessegdevice, magassagdevice, hosszusagdevice);

					System.out.println("Move the subject?");
					char ansMove = beolvas.next().charAt(0);
					boolean move;
					if (ansMove == 'i')
						move = true;

					else
						move = false;
					beolvas.nextLine();
					device.add(new Device(producer, year, waste, deviceID, devicename, weight, material, meretdevice,
							move, price));
					beolvas.close();
				}

				rooms.add(new Room(szobaszam, roomPlace, type, meret, beds, device));
			}
			hospitals.add(new Hospital(id, roomNumber, name, size, rooms, hospitalPlace));
			System.out.println("registered!");

		}
		return hospitals;
	}

	public void removeRoom(Hospital hospital, Room room) {

		for (Hospital h : hospitals) {
			if (h.getId() == hospital.getId()) {
				h.removeRoom(room);
				return;
			}

		}
	}

	public void write(ArrayList<Hospital> hospitals) {
		for (Hospital h1 : hospitals) {
			System.out.print(h1);
		}

	}
}
