package evohealthcare.backend;

public class Size {
	private int lenght;
	private int height;
	private int width;

	public Size(int lenght, int height, int width) {
		this.lenght = lenght;
		this.height = height;
		this.width = width;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidtht(int width) {
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return "Size [lenght=" + lenght + ", height=" + height + ", width=" + width + "]";
	}

}
