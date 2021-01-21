package evohealthcare.backend.login;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import evohealthcare.backend.JacksosSerializator;

public class AccessManager {
	private static AccessManager instance = null;
	private ArrayList<User> users;

	private AccessManager() {
		users = new ArrayList<User>();
	}

	public static AccessManager instance() {
		if (instance == null) {
			instance = new AccessManager();
		}
		return instance;
	}

	public void finalize() {
		instance = null;
	}

	public boolean addUser(String username, String password, String rePassword, String email, String reEmail,
			String name) {
		boolean ok = true;
		if (password == rePassword && email == reEmail) {
			for (User usr : users) {
				if (usr.getUsername() == username) {
					ok = false;
				}
			}
		} else {
			ok = false;
		}
		if (ok) {
			return users.add(new User(username, password, email, name));
		}
		return false;
	}

	// unsafe
	public void getAllUser(String output) throws IOException {
		StringBuilder strb = new StringBuilder();
		strb.append('[');
		for (int i = 0; i < users.size(); i++) {
			strb.append(users.get(i));
			if (i < users.size() - 1) {
				strb.append(',');
			}
		}
		strb.append(']');
		File file = new File(output);
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		writer.write(strb.toString());
		writer.close();
	}

}