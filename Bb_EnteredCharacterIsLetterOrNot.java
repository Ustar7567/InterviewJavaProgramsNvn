package NvnAutomation;

public class Bb_EnteredCharacterIsLetterOrNot {

	public static void main(String[] args) {
		letterOrNot('A');
		letterOrNot('Z');
		letterOrNot('h');
		letterOrNot('i');
		letterOrNot('4');
		letterOrNot(' ');
		letterOrNot('{');
	}
	
	public static void letterOrNot(char x) {
		//Method 1 using ASCII value
		//int ascii=x;
		//if(ascii<=90 && ascii >=65 || ascii<=122 && ascii >=97) 
		//Method 2
		if(x>='a' && x<='z' || x>='A' && x<='Z'){
			System.out.println("Letter from the Alphabet");
		}
		else {
			System.out.println("Not a letter from the Alphabet");
		}
	}

}
