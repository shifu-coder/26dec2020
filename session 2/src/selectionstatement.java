
public class selectionstatement {

	public static void main(String[] args) {

		/*
		 * WELCOME Get 50% OFF up to 100. On orders above 300
		 * 
		 * MAXSAFETY Get 20% OFF up to 50. Valid on orders above 149.
		 */

		int totalAmount = 3000;
		String promoCode = "MAXSAFETY";
		if (totalAmount > 149 && promoCode=="MAXSAFETY") {
			double discount1 = 0.8 * totalAmount;
			
				System.out.println("discount availed MAXSAFETY");
				System.out.println("Your bill is " + discount1);
				if (discount1 > 200) {
					discount1 = 200;
			}
		} else if (totalAmount > 300 && promoCode == "Well") {
			System.out.println("welcome applied");
			double discount2 = 0.5 * totalAmount;
			System.out.println("your bill is " + discount2);
		} else {
			System.out.println("Your bill is " + totalAmount);
			System.out.println("sorry no discount");
		}

	}
}