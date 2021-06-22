package NvnAutomation;

public class Da_CheckIfNumCanBeExpressedAsSumOfPrimeNums {

	public static void main(String[] args) {
		int num=54;
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(checkPrime(i)) {
				if(checkPrime(num-i)) {
					System.out.println(num+"="+i+"+"+(num-i));
					flag=true;
				}
				
			}
		}
		if(!flag) {
			System.out.println("Num can't be expressed as sum pf prime numbers");
		}
		

	}
	
	public static boolean checkPrime(int num) {
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}	
		}	
		return isPrime;
	}
}
