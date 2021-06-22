package NvnAutomation;

public class Ai_LargestAmongThreeNums {

	public static void main(String[] args) {
		largestNum(20,40,40);
		largestNum(60,749,0);
		largestNum(-569,-4,-3);

	}
	
	public static void largestNum(int a, int b, int c) {
		if(a>b&&a>c) {
			System.out.println(a+" is the largest number");
		}
		else if(b>c) {
			System.out.println(b+" is the largest number");
		}
		else {
			System.out.println(c+" is the largest number");
		}
		
	}
}
