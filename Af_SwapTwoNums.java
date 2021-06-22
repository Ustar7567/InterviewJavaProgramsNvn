package NvnAutomation;

public class Af_SwapTwoNums {

	public static void main(String[] args) {
		withTempVariable(5,7);
		withoutTemp(43, 28);

	}
	
	public static void withTempVariable(int a, int b) {
		System.out.println("Before swapping with temporary variable");
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping with temporary variable");
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		
	}
	
	public static void withoutTemp(int a, int b) {
		System.out.println("Before swapping without temporary variable");
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		b=a+b-(a=b);
		System.out.println("After swapping without temporary variable");
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
	}

}
