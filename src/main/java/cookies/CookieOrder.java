package cookies;

public class CookieOrder {

	private int numBoxes;
	private String variety;

	public String getVariety() {
		return variety;
	}

	public int getNumBoxes() {

		return numBoxes; // make flexible
		// field
	}

	public CookieOrder(String variety, int numBoxes) {
		// Auto-generated constructor stub
		this.variety = variety;
		this.numBoxes = numBoxes;

	}

}
