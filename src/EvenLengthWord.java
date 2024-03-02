
public class EvenLengthWord {
	//to print Even length words in a String
	public static void printWord(String s) {
		for(String word:s.split(" ")) 
			if(word.length()%2==0)
				System.out.println(word);
			
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a java program for even length";
		printWord(s);
		

	}

}