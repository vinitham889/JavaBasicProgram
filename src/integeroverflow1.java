
public class integeroverflow1 {
	//printing string 10 times using recursion
	public static void printString(String str, int n) {
		if(n>0) {
			System.out.println(str+"****"+n);
			n=n-1;
			printString(str,n);
		}
		else {
			return;
		}
	}

	public static void main(String[] args) {
		String str = "Hello world";
		int n =10;
		printString(str,n);

	}

}
