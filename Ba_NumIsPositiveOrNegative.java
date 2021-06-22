package NvnAutomation;

public class Ba_NumIsPositiveOrNegative {

	public static void main(String[] args) {
		posOrNeg(700);
		posOrNeg(-78.97676565);
		posOrNeg(65.45);
		posOrNeg(-78976);
		posOrNeg(0);

	}
	public static void posOrNeg(long a) { //Works for both integers and long numbers
		if(a>0.0) {
			System.out.println("Positive");
		}
		else if(a<0.0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Enter a non-zero number");
		}
	}
	
	public static void posOrNeg(double a) { //Works for both float and double numbers
		if(a>0.0) {
			System.out.println("Positive");
		}
		else if(a<0.0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("Enter a non-zero number");
		}
	}

}
