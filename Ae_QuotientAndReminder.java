package NvnAutomation;

public class Ae_QuotientAndReminder {

	public static void main(String[] args) {
		quoAndRem(50,10);
		quoAndRem(30,4);
	}
	
	public static void quoAndRem(int dividend, int divisor) {
		
		int quo=dividend/divisor;
		int rem=dividend%divisor;
		System.out.println("Quotient is "+quo);
		System.out.println("Reminder is "+rem);
		System.out.println("");//just leaving one line space
		
	}

}
