
public class EvenLengthWord {
	//to print Even length words in a String
	public static void printWord(String s) {
		String[] word = s.split("\\s");
		for(String words:word) 
			if(words.length()%2==0)
			
				System.out.print(words+" ");
			
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a java program for even length";
		printWord(s);
		

	}

}