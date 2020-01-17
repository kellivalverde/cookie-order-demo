package cookies;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MasterOrderTest {

	@Test // 1

	public void shouldReturnTotalBoxesAsOne() {
		// name method with what you hope to test for
		MasterOrder underTest = new MasterOrder();

		underTest.addOrder(new CookieOrder("", 1));
		// 1 is what we think it will return

		int check = underTest.getTotalBoxes();

		assertEquals(1, check);
	}

	@Test // 2
	public void shouldReturnTotalBoxesAsTwo() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("", 1));
		underTest.addOrder(new CookieOrder("", 1));
		int check = underTest.getTotalBoxes();

		assertEquals(2, check);
	}

	/*
	 * need to put something into our collection to test if the boxes are being kept
	 * track of
	 */

	// add in a cookie order
	@Test
	public void shouldReturnTotalBoxesAsFour() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("", 1));
		underTest.addOrder(new CookieOrder("", 3));
		int check = underTest.getTotalBoxes();

		assertEquals(4, check);
	}

	@Test
	public void shouldReturnTotalBoxesAsOneAfterRemoval() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Samoas", 1));
		underTest.addOrder(new CookieOrder("Thin Mints", 1));
		underTest.removeVariety("Samoas");
		int check = underTest.getTotalBoxes();

		assertEquals(1, check);
	}

	@Test
	public void shouldReturnTotalBoxesAsOneAfterRemovalOfAllPlain() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("Plain", 1));
		underTest.addOrder(new CookieOrder("Plain", 1));
		underTest.addOrder(new CookieOrder("Thin Mints", 1));
		underTest.removeVariety("Plain");
		int check = underTest.getTotalBoxes();

		assertEquals(1, check);
	}

}
