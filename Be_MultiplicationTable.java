package NvnAutomation;

public class Be_MultiplicationTable {

	public static void main(String[] args) {
		mulTab(-7);
		mulTab(17);
		mulTab(0);

	}
	
	public static void mulTab(int n) {
		int mul=1;
		for(int i=1;i<=10;i++) {
			mul=n*i;
			System.out.println(n+"x"+i+"="+mul);
		}
		System.out.println("");
	}

}
