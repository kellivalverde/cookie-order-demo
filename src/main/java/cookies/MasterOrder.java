package cookies;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {
	// mirrors the MasterOrderTest class in the test package

	// make an ArrayList for our cookies

	List<CookieOrder> orders = new ArrayList<>();

	//private CookieOrder order;

	public void addOrder(CookieOrder cookieOrder) {
		orders.add(cookieOrder);

	}

	// corresponds to Test 1
	public int getTotalBoxes() {

		int boxes = 0;
		for (CookieOrder order : orders) {
			boxes += order.getNumBoxes();

			// getNumBoxes is a method function - want to add boxes every time we call this

		}

		return boxes;
	}


	public void removeVariety(String variety) {
		for (int i = orders.size() - 1; i >= 0; i--) {  // includes zero and counts backwards - moving backwards because ArrayLists auto-collapse behind you
			if (orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}

		}
	}

	public void showOrder() {
		for(CookieOrder order : orders) {
			System.out.println("Variety: " + order.getVariety() + " Boxes: "+ order.getNumBoxes());
			
		}
	
	}
}
