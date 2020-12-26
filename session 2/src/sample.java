import java.util.Arrays;

class methods {

	int findmax(int[] array) {

		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];

//				System.out.println(array);
//				System.out.println(Arrays.toString(array));
//				System.out.println(max);

			}
		}

		return max;
	}

}

public class sample {

	public static void main(String[] args) {
		methods obj = new methods();
		int result=0;
		int[] productPrices = { 101, 301, 543, 1675, 900, 510, 1000, 1200, 200 };
		int[] scores = { 10, 30, 45, 88, 72, 12, 101, 10, 5 };
		int[] activeCovidCases = { 23122, 34321, 33121, 8654, 1123 };
		
		result = obj.findmax(productPrices);
		System.out.println("Maximum product Price " + result);
		result = obj.findmax(scores);
		System.out.println("Maximum score " + result);
		result = obj.findmax(activeCovidCases);
		System.out.println("Maximum  " + result);
	}
}
