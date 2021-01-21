package evohealthcare.backend;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import evohealthcare.backend.login.AccessManager;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.println("How many hospitals would you like to record?");// bar igy hogy ezt is atirtam array listre
																			// igy akarmennyit lehet lehet egy olyan
																			// kerdes akarsz-e meg beolvasni korhazat.
		int szam = input.nextInt();
		InMemoryHospitalService h = new InMemoryHospitalService();
		ArrayList<Hospital> hospitals = new ArrayList<Hospital>();
		hospitals.addAll(h.inputReader(szam));
		input.close();
		JacksosSerializator.getJackSON((Object) hospitals, "frontend.json");
		h.write(hospitals);

		AccessManager am = AccessManager.instance();
		am.addUser("user1", "pwd1", "pwd1", "a@b.c", "a@b.c", "elso user");
		am.addUser("user2", "pwd", "pwd", "a@b.cr", "a@b.cr", "masodik user");
		am.addUser("user3", "pwda", "pwda", "a@b.cu", "a@b.cu", "enedik user");
		am.getAllUser("frontendUser.json");
	}

}
