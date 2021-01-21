package evohealthcare.backend;

public class Analog extends Device {

	/**
	 * Az analóg eszköz élettartama.
	 */
	private int lifetimeOccasion;
	/**
	 * Az analóg eszköz élessége.
	 */
	private boolean sharp;

	/**
	 * Pédányosít egy analóg eszközt az összes adattagjának megadásával
	 * 
	 * @param producer         Az analóg eszköz gyártójának neve.
	 * @param year             Az analóg eszköz gyártási éve.
	 * @param waste            Az analóg eszköz egyszeri illetve többszöri
	 *                         használhatósága.
	 * @param id               Az analóg eszköz azonosítója.
	 * @param type             Az analóg eszköz tipusa.
	 * @param weight           Az analóg eszköz súlya.
	 * @param material         Az analóg eszköz anyaga.
	 * @param size             Az analóg eszköz mérete.
	 * @param move             Az analóg eszköz hordozhatósága.
	 * @param price            Az analóg eszköz ára.
	 * @param lifetimeOccasion Az analóg eszköz élettartama.
	 * @param sharp            Az analóg eszköz élessége.
	 */
	public Analog(String producer, int year, boolean waste, int id, String type, double weight, String material,
			Size size, boolean move, int price, int lifetimeOccasion, boolean sharp) {
		super(producer, year, waste, id, type, weight, material, size, move, price);
		this.lifetimeOccasion = lifetimeOccasion;
		this.sharp = sharp;
	}

	@Override
	public String toString() {
		return "Analog [LifetimeOccasion=" + lifetimeOccasion + ", sharp=" + sharp + "]";
	}

}
