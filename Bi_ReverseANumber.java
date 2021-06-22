package NvnAutomation;

public class Bi_ReverseANumber {

	public static void main(String[] args) {
		reverse(12345); 
		reverse(222);
		reverse(877766565);
	}
	
	public static void reverse(int num) {
		
		int rev=0;
		while(num!=0) {
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		System.out.println(rev);
	}

}
