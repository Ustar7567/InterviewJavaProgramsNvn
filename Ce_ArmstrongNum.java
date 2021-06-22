package NvnAutomation;

public class Ce_ArmstrongNum {

	public static void main(String[] args) {
		// 1*1*1+ 5*5*5+ 3*3*3 = 153
		//Sum of each digit's cube equals the number itself
		arm(153);//armstrong
		arm(22);
		arm(370);//armstrong
		arm(2746);
		arm(407);//armstrong

	}
	public static void arm(int num) {
		int check=0;
		int num1=num;
		while(num1!=0) {	
			int t=num1%10;
			int cube=t*t*t;//int cube=Math.pow(t,3); we can use inbuilt power function also
			check=check+cube;
			num1=num1/10;
			
		}
		if(num==check) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not an Armstrong");
		}
	}

}
