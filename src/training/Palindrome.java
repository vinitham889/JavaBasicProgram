package training;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		if(isPlaindrome(str))
		{
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
			
		
		
		

	}
	public static boolean isPlaindrome(String str)
	{
		
	    int start =0;
	    str = str.replaceAll("\\s", "").toLowerCase();
		int end = str.length()-1;
		
		
		
		while(start<end)
		{
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end --;
		}
		return true;
		
	}

}
