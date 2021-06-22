package NvnAutomation;

public class Ad_FindASCIIValueOfACharacter {

	public static void main(String[] args) {
		char ch='f'; //We can give any charcter here like number, symbol, capital letters also
		//int asciiValue=ch; We can directly write this line or 
		int asciiValue=(int)ch; //We are type casting in this line. Anyway, both lines give the same output
		System.out.println(asciiValue);

	}

}
