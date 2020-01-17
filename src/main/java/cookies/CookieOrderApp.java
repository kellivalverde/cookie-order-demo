package cookies;

import java.util.Scanner;

public class CookieOrderApp {

	public static void main(String[] args) {

		/*
		 * Add 4 orders Total the boxes purchased Show the list Remove a variety and
		 * give feedback on how many boxes were removed Show the updated list
		 */

		Scanner input = new Scanner(System.in);

		MasterOrder myOrder = new MasterOrder();
		myOrder.addOrder(new CookieOrder("Tagalongs", 1));
		myOrder.addOrder(new CookieOrder("Do-si-Does", 3));
		myOrder.addOrder(new CookieOrder("Thin Mints", 1));
		myOrder.addOrder(new CookieOrder("Samoas", 10));
		myOrder.addOrder(new CookieOrder("Trefoils", 1));

		System.out.println("Your Cookie Order");

		System.out.println();

		System.out.println("Total boxes ordered: " + myOrder.getTotalBoxes());

		System.out.println(
				"\nWould you like to remove any cookies? No judgement. \nPlease specify a variety or say none");

		String varietyToRemove = input.nextLine();

		System.out.println("\nYou are removing " + varietyToRemove + "\n");

		myOrder.removeVariety(varietyToRemove);
		myOrder.showOrder();

		System.out.println("\nTotal boxes ordered: " + myOrder.getTotalBoxes());

		System.out.println("\nHave a delicious day!");

	}

}
