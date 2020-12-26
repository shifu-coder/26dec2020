import java.util.Arrays;

public class d_array {

	public static void main(String[] args) {
		
		int[] maharashtraCovidCases = {23123, 3344, 76544};
		int[] punjabCovidCases = {13123, 344, 6544};
		int[] haryanaCovidCases = {3123, 421, 5414};
		int[] karnatakaCovidCases = {1235, 4421, 4114};
		int[] delhiCovidCases = {4231, 3344, 1214};
		
		int[][] indiacases= {maharashtraCovidCases,punjabCovidCases,haryanaCovidCases,karnatakaCovidCases,delhiCovidCases};
		
		for(int [] array:indiacases)
		{System.out.println(Arrays.toString(array));
		}
		
		
		System.out.println(Arrays.toString(indiacases));
	}

}
