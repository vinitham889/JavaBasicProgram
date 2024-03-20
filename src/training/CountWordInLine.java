package training;

public class CountWordInLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My Name Is Vinitha";
		int count =1;
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				count++;
				
			}
		}
		System.out.println("No of words in string:"+count+"\n");

	}

}
