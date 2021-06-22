package NvnAutomation;

import java.util.Scanner;

public class Cg_CalculatorSwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("Enter the operation that you would like to perform(+,-,*,/)");
		char op=sc.next().charAt(0);
		double result=0;
		switch (op) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;			
			break;

		default:
			System.out.println("Please select a valid operator");
			break;
		}
		System.out.println(result);

	}

}
