
public class Breakcontine {

	public static void main(String[] args) {
		
		String[] products={"shoe","socks","tv","fridge","generator","inverter"};
		
		String search="tv";
		for (int idx=0; idx<products.length;idx++) {
			System.out.println("serarching");
			  if (search!=products[idx])
			  {System.out.println("product not found");
			  continue;}
			  else;
			  {System.out.println("product found");}
			break;  
			  }
		
	
		 
		
	     	/*String search = "tv";

			for(int idx=0; idx<products.length; idx++) {
				System.out.println("SEARCHING FOR "+search+" AND MATCHING WITH "+products[idx]);
				if(search == products[idx]) {
					System.out.println("PRODUCT FOUND :)");}*/
					
		

	}

}
