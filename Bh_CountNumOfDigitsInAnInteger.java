package NvnAutomation;

public class Bh_CountNumOfDigitsInAnInteger {

	public static void main(String[] args) {
		int num=65890;
		//Good use case input long num=9849765437l(l cz it's a long num) 10 digit integer (Phone number no.of digits use case)
		int count=0;
		
		while(num!=0) {
			num=num/10;
			count++;
		}
        System.out.println(count);
	}

}
