package evohealthcare.backend;

public class CT_machine extends Digital {

	double minutetest; // vizsgálatidő

	/**
	 * L�trehoz egy CT gépet az összes adattagjának megadásával.
	 * 
	 * @param producer A CT gép gyártója.
	 * @param year     A CT gép gyártási éve.
	 * @param id       A CT gép azonosítója.
	 * @param weight   A CT gép súlya.
	 * @param size     A CT gép mérete.
	 * @param move     A CT gép hordozhatósága.
	 * @param price    A CT gép ára.
	 * @param screen   A CT gép kijelzője.
	 * @param software A CT gép szofvere.
	 */
	public CT_machine(String producer, int year, int id, double weight, Size size, int price, String screen,
			Software software, double minutetest) {
		super(producer, year, false, id, "CT Machine", weight, "Iron", size, false, price, screen, software);
		this.minutetest = minutetest;
	}

	public double getMinutetest() {
		return minutetest;
	}

	public void setMinutetest(double minutetest) {
		this.minutetest = minutetest;
	}

}
