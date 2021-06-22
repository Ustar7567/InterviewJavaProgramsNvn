package NvnAutomation;

public class Ah_VowelOrConsonant {

	public static void main(String[] args) {
		
		vowOrConsIf('b');
		vowOrConsIf('o');
		vowOrConsIf('X');
		vowOrConsIf('I');
		vowOrConsSwitch('E');
		vowOrConsSwitch('H');
		vowOrConsSwitch('a');
		vowOrConsSwitch('p');
		

	}
	
	public static void vowOrConsIf(char x) {
		if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}
	
	public static void vowOrConsSwitch(char x) {
		
		switch (x) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Vowel");
			break;

		default:
			System.out.println("Consonant");
			break;
		}
		
	}

}
