package training;

import java.util.ArrayList;

public class MissingCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="The quick brown fox jumps over the dog";
		ArrayList<Character> al = new ArrayList<>();
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(c>='a'&&c<='z')
			{
				al.add(c);
			}
			else if(c>='A'&&c<='Z')
			{
				al.add(Character.toLowerCase(c));
			}
		}
		StringBuilder missingChar = new StringBuilder();
		for(char c='a';c<='z';c++)
		{
			if(!al.contains(c))
			{
				missingChar.append(c);
			}
		}
		if(missingChar.length()==0)
		{
			System.out.println("The string is pangram");
		}
		else
		{
			System.out.println(missingChar);
		}
		//output :alyz


	}

}
