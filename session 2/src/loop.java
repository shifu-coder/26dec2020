
public class loop {

	public static void main(String[] args) {
		/*int emp1 =1000;
		int emp2 = 2000;
		int emp3= 3000;
		int emp4 = 4000;*/
		
		double [] empsalaryold= {1000,2000,3000,4000};
		/*System.out.println("emp1 sal is " + empsalaryold[0]);
		double empnewsal1=(0.1*empsalaryold[0])+(empsalaryold[0]);
		System.out.println("emp1 new sal is "+empnewsal1);
		
		System.out.println("emp2 sal is " + empsalaryold[1]);
		double empnewsal2=(0.1*empsalaryold[1])+(empsalaryold[1]);
		System.out.println("emp2 new sal is "+empnewsal2);
		
		System.out.println("emp3 sal is " + empsalaryold[2]);
		double empnewsal3=(0.1*empsalaryold[2])+(empsalaryold[2]);
		System.out.println("emp3 new sal is "+empnewsal3);
		
		System.out.println("emp4 sal is " + empsalaryold[3]);
		double empnewsal4=(0.1*empsalaryold[3])+(empsalaryold[3]);
		System.out.println("emp4 new sal is "+empnewsal4);*/
		
		/*int idx=0;
		while (idx<4) {
		System.out.println("emp sal ["+idx+"]" +empsalaryold[idx]);
		double empnewsal=(0.1*empsalaryold[idx])+(empsalaryold[idx]);
		System.out.println("emp new sal is "+empnewsal);
		idx++;*/
		
		/*int idx=0;
		do {
		System.out.println("emp sal ["+idx+"]" +empsalaryold[idx]);
		double empnewsal=(0.1*empsalaryold[idx])+(empsalaryold[idx]);
		System.out.println("emp new sal is "+empnewsal);
		idx++;}
		while (idx<4);*/
		
		/*for ( int idx=0;idx<4;idx++) {
		System.out.println("emp sal ["+idx+"]" +empsalaryold[idx]);
		double empnewsalary=(0.1*empsalaryold[idx])+(empsalaryold[idx]);
		System.out.println("emp new salary is "+empnewsalary);*/
		
		for(double element:empsalaryold) {
			double a1=0.1*element+element;
			System.out.println("oldsalary " +element);
			System.out.println("new salary " +a1);
			System.out.println();
			}
		
		}
	
		
		
	
	}


