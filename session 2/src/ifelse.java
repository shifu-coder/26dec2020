public class ifelse {

	public static void main(String[] args) {

		int totalAmount = 1000;
		String promoCode= "WELCOME";
		if (totalAmount > 149 &&  promoCode.equalsIgnoreCase("MAXSAFETY"))
		{	double discount1=0.8*totalAmount;
			System.out.println("discount availed MAXSAFETY");
			System.out.println("Your bill is "+ discount1);
		}
			else if(totalAmount > 300 && promoCode.equalsIgnoreCase("WELCOME"))
			{	System.out.println("welcome applied");
				double discount2=0.5*totalAmount;
				System.out.println("your bill is "+discount2);
			}
			
		else {
			System.out.println("Your bill is "+totalAmount);
			System.out.println("sorry no discount");
		}	
	}
}	
