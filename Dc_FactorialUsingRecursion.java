package NvnAutomation;

public class Dc_FactorialUsingRecursion {

	public static void main(String[] args) {
		int fac=mul(5);
		System.out.println(fac);

	}

	public static int mul(int num) {
		if (num >= 1) {
			return num * mul(num - 1);
		} else {
			return 1;
		}
	}

}
