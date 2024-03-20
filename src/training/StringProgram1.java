package training;

//Input String "aaabbddce"  output : a3b2d2c1e1

public class StringProgram1 {
	public static void encoding(String str) {
		int n = str.length();
		for(int i=0;i<n;i++)
		{
			int count =1;
			while(i<n-1&&str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			System.out.print(str.charAt(i)+""+count);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabbddce";
		encoding(str);
		
		

	}

}
