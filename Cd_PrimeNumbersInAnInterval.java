package NvnAutomation;

public class Cd_PrimeNumbersInAnInterval {

	public static void main(String[] args) {
		prime(20,50);
		prime(2,10);
		prime(0,10);
	}
	
	public static void prime(int a, int b) {
		
		if(a>=2) {
		
		while(a<b) {
			boolean flag=false;
			for(int i=2;i<a/2;i++) {
				if(a%i==0) {
					flag=true;
					break;
				}
			}
			if(!flag && a!=4) {
				System.out.print(a+" ");
			}
			a++;
		}
		}
		else {
			System.out.println("Change 'a' value to greater than 1");
		}	
		
}
}
