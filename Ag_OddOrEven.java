package NvnAutomation;

import java.util.Scanner;

public class Ag_OddOrEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		Ag_OddOrEven obj=new Ag_OddOrEven();  //Creating object cz it is non-static method
		obj.OddOrEven(a); //Taking input from user //Try 0,negative numbers and positive numbers for coverage

	}
	
	public void OddOrEven(int a) {  //non-static method
		if(a%2==0) {
			System.out.println("Entered number ("+a+") is even");		
			}
		else {
			System.out.println("Entered number ("+a+") is odd");
		}
	}

}
