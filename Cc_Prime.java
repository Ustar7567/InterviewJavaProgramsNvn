package NvnAutomation;

public class Cc_Prime {

	public static void main(String[] args) {
		prime(7);
		prime(72);
		prime(37);
		prime(81);
		prime(0);
		prime(-4);
		prime(2);

	}
	
	public static void prime(int num) {
		boolean flag=false;
		if(num<=1) {
			System.out.println("Entered numbers should be greater than 1 to check the condition");
		}
		else {
			for(int i=2;i<=num/2;i++) {
				int n=num%i;
				if(n==0) {
					flag=true;
				}
			}
			if(!flag) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not a prime");
			}
		}
		
	}

}
