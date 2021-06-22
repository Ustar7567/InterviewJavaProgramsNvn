package NvnAutomation;

public class Ac_FloatMultiplication {

	public static void main(String[] args) {
		floatmul(2.5f, 5.4f);
		floatmul(5f,4.3f); //float can be used to integers as well 5f means 5.0
		
//As floatmul is a static method, no need to create an obj
//Remember to append f while passing float values
	}
	
	public static void floatmul(float f1, float f2) {
		System.out.println("The product is "+f1*f2);
	}

}
