import java.lang.reflect.Array;
import java.util.Arrays;

public class aRRAYS {

	public static void main(String[] args) {
		int [] array1 = {10, 20, 30, 40, 50};
		int[] array2 =new int[10];
				
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		
		System.arraycopy(array1, 3, array2, 8,1);
		System.out.println(Arrays.toString(array2));
		
		
		char [] array3= {'w','r','t','i'};
		char [] array4= {'s','e','p','k','g','j','m'};
		System.out.println(Arrays.toString(array3));
	
		System.out.println(Arrays.toString(array4));
		int[]array5=new int [6];
		array5[0]= 33;
		array5[1]= 73;
		array5[2]= 03;
		array5[3]= 90;
		array5[4]= 453;
		array5[5]= 393;
		System.out.println(Arrays.toString(array5));
		System.out.println(Array.getLength(array3));
		System.out.println(array3.length);
		
		for(int element:array5)
		{System.out.print(element+" ");}
		
		
	}

}
