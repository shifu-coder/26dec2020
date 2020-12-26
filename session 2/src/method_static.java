import java.util.Arrays;

public class method_static {
	static int findmax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {

			if (array[i] > max) {
				max = array[i];
			}

		}
		return max;

	}

	public static void main(String[] args) {
		int[] productprice = { 10, 200, 34, 54, 66,1000 };
	
	System.out.println(findmax(productprice));
		System.out.println(Arrays.toString(productprice));
	}

}
