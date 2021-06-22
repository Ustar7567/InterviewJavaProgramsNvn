package NvnAutomation;

public class Eb_DecimalToBinary {

	public static void main(String[] args) {
		System.out.println(d_To_b(34));
		System.out.println(d_To_b(76));
		
	}
	
	public static long d_To_b(long num) {
		
		long rem=1;
		int i=1;
		long binNum=0;
		
		while(num!=0) {
			rem=num%2;
			num=num/2;
			binNum=binNum+rem*i;
			i=i*10;
						
		}
		return binNum;
		
	}

}
