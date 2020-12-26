
public class oops {

	public static void main(String[] args) {

		// 1. Think of an Object
//		    Object:    RestaurantSelection
//		    Attributes: fromLocation, toLocation, departureDate, travellers, travelClass

		// 2. Create Class
		
		 // Create Attributes in the Class which will be exactly the property of Object and not of class
		 // whatever we code in class is by default the property of Object
		class RestaurantSelecton {
		 String Location;
		 String Cuisine;
		 int Rating;
		 int NumofPpl;
		 String Budget;}
		  
		  // 3. From the Drawing create the real object :)
		RestaurantSelecton ref1 = new RestaurantSelecton(); // new RESTAURANT SELECTION() -> is instruction to create the object
		RestaurantSelecton ref2 = new RestaurantSelecton();
		RestaurantSelecton ref3 = ref1;
		  
		  // ref1, ref2 and ref3 are JUST reference variables which will hold the data i.e. HASHCODE of the Object in HEAP
		  
		  System.out.println("ref1 is: "+ref1);
		  System.out.println("ref2 is: "+ref2);
		  System.out.println("ref3 is: "+ref3);

	}

}
