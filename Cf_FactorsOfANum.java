package NvnAutomation;

public class Cf_FactorsOfANum {

	public static void main(String[] args) {
		fac(10);
		fac(29);
		fac(100);

	}
	public static void fac(int num) { 
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");		
			}			
		}
		System.out.println("\n");
		
	}
}
