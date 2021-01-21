package evohealthcare.backend;

import java.util.Scanner;

public class Software {
	Scanner input = new Scanner(System.in);
	private String name;
	private int version;
	private int size;

	public Software(String name, int version, int size) {
		this.name = name;
		this.version = version;
		this.size = size;
	}

	public Software() {
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public void setSize(int Size) {
		this.size = Size;
	}

	public String getName() {
		return name;
	}

	public int getVersion() {
		return version;
	}

	public int GetSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Software [input=" + input + ", name=" + name + ", version=" + version + ", Size=" + size + "]";
	}

	// ez szerintem nem ide valo
	public void now() {

		if (version < 2010) {
			System.out.print("This software is too old,you should be refresh");
			String answer;
			System.out.print("Do you want to refresh?");
			answer = input.nextLine();
			if (answer == "yes") {
				System.out.print("wait..");
				// sleep(10);
				version = 2019;
			} else {
				System.out.print("Ok.");
			}
		}

	}
}
