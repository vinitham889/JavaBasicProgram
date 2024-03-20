package training;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovePalin {
	public static boolean checkPalin(String str) {
		int i=0,j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		ArrayList<String> nonPalin = new ArrayList<String>();
		String[] word = str.split("\\s+");
		for(String word1:word)
		{
			if(!(checkPalin(word1)))
			{
				nonPalin.add(word1);
			}
		}
		String result = String.join(" ", nonPalin);
		System.out.println("String after removing palindromes: " + result);
		//output : Enter string
//		Text level is malayalam
//		String after removing palindromes: Text is

	}

}
