package NvnAutomation;

public class Db_SumOfNaturalNumsUsingRecursion {

	public static void main(String[] args) {
		//Natural numbers start with 1.
	    // Recursion means a method that is calling itself again and again to perform a particular operation
		int num=6;
		int sum=addNum(num);
		System.out.println(sum);

	}
	public static int addNum(int num) {
		if(num!=0) {
			return (num + addNum(num-1));		
		}
		else {
			return num;
		}
	}
	

}
