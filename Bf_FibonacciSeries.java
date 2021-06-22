package NvnAutomation;

public class Bf_FibonacciSeries {

	public static void main(String[] args) {
		fib(10);
		fib(4);

	}
	
	public static void fib(int n) {
		//0 1 1 2 3 5 8 13
		
		int f1=0;
		int f2=1;
		System.out.println("Generated fibonacci series upto "+n+" terms is as follows");
		for(int i=0;i<n;i++) {
			
			System.out.print(f1+" ");
			int f=f1+f2;
			f1=f2;
			f2=f;
			
		}
		System.out.println("\n");
		
	}

}
