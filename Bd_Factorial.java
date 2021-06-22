package NvnAutomation;

public class Bd_Factorial {

	public static void main(String[] args) {
		fac(0); // Factorial of 0 is 1
		fac(5);
		fac(18);
		fac(-7);

	}

	public static void fac(int n) {
		if (n < 0) {
			System.out.println("Factorial for negative numbers can't be defined");
		} else {

			long fac = 1; // Using long here cz factorial of big numbers will be of so more digits
			for (int i = 1; i <= n; i++) {
				fac = fac * i;
			}
			System.out.println("Factorial of " + n + " is " + fac);
		}
	}

}
