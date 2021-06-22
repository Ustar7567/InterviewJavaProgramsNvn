package NvnAutomation;

public class Cb_PalindromeNumOrNot {

	public static void main(String[] args) {
		pal(4321);
		pal(555);
		pal(34543);
		pal(010);
		pal(766565644);
		pal(100);

	}
	public static void pal(int num) {
		int num1=num;
		int rev=0; 
		while(num1!=0) {
			int temp=num1%10;
			rev=rev*10+temp;
			num1=num1/10;
		}
		if(num==rev) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome number");
		}
	}

}
