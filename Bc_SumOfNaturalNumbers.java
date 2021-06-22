package NvnAutomation;

public class Bc_SumOfNaturalNumbers {

	public static void main(String[] args) {
		sumNatFor(7);
		sumNatFor(100);
		sumNatWhile(100);

	}
	
	public static void sumNatFor(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
	}
	public static void sumNatWhile(int n) {
		int sum1=0;
		int k=1;
		while(k<=n) {
			sum1=sum1+k;
			k++;
		}
		System.out.println("Sum is "+sum1);

	}
	

}
