package NvnAutomation;

public class Ea_BinaryToDecimal {

	public static void main(String[] args) {
		
		System.out.println(b_To_d(100101));

	}

	public static double b_To_d(long num) {
		int i = 0;
		long rem;
		double decNum=0;
		
		while (num != 0) {
			rem = num % 10;
			num=num/10;
			decNum=decNum+(rem*Math.pow(2, i));
			i++;
		}
		return decNum;
	}

}
