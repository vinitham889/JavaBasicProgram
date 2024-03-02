
public class RemovePalin {
	public static boolean checkPalindrome(String str)
	{
		int i=0,j= str.length()-1;
		while(i<j)
		{
			if(str.charAt(i++)!=str.charAt(j--))
			{
				return false;
			}
		}
		return true;
	}
	public static String removeplaindrome(String str)
	{
		String last ="", word ="";
		int n = str.length();
		str = str+" ";
		for(int i=0;i<n-1;i++)
		{
			if(str.charAt(i)!= ' ') {
				word = word +str.charAt(i);
			}else {
				if(!(checkPalindrome(word))) {
					last += word + " ";
				}
				word = "";
			}
				
		}
		return last;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Text Level and malayalam is";
		str = str.toLowerCase();
		System.out.println(removeplaindrome(str));

	}

}
