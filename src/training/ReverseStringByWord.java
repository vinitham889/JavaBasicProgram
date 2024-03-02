package training;

import java.util.Scanner;

public class ReverseStringByWord {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Original string : ");

			String originalStr = scanner.nextLine();

			String words[] = originalStr.split("\\s");
			String reversedString = "";
			System.out.println(words.length);

			for (int i = 0; i < words.length; i++) 
			{
				
				String word = words[i];
				String reverseWord = "";
				for (int j = word.length() - 1; j >= 0; j--) {
					reverseWord = reverseWord + word.charAt(j);
				}
				reversedString = reversedString + reverseWord+" " ;
			}

			// Displaying the string after reverse
			System.out.print("Reversed string : " + reversedString);
		}
	}
// output
//Original string : vinitha software engg
//Reversed string : ahtiniv erawtfos ggne 