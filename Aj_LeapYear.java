package NvnAutomation;

public class Aj_LeapYear {

	public static void main(String[] args) {
		//Leap years will hv 366 days and non-leap years hv 365 days
		//Leap years usually are divided by 4 with reminder 0. 
		//But century years like 1900(non-leap) 2000(leap) are checked if they are divisible by 400 to see if they are leap.

		checkLeap(2016);//Non-century leap
		checkLeap(2000);//Century leap
		checkLeap(1900);//Century non-leap
		checkLeap(2023);//Non-century non-leap
		checkLeap(2021);//Current year
		
	}
	
	public static void checkLeap(int year) {
		boolean status=false;
		//Non-century years
		if(year%4==0) {
			status=true;
		}
		else {
			status=false;
		}
		//Century years
		if(year%100==0) {
			if(year%400==0) {
				status=true;
			}	
			else {
				status=false;
			}
		}
		if(status==true) {
			System.out.println("Leap");
		}else {
			System.out.println("Non-leap");
		}
	}
}
