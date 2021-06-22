package NvnAutomation;

public class Ca_PowerOfANum {

	public static void main(String[] args) {
		pow(56,3);
		pow(2,4);
		pow(7,2);
		pow(2,0);
		double powerUsingInbuiltMethods=Math.pow(56,3);//Math.pow is the in-built method for power calculation
		System.out.println(powerUsingInbuiltMethods);

	}
	public static void pow(int num, int power) {
		long powerOfNum=1; //cz any number power 0 is 1
		for(int i=0;i<power;i++) {
			powerOfNum=powerOfNum*num;
		}
		System.out.println(powerOfNum);
	}
	
	

}
