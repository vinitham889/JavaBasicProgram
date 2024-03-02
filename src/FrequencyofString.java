
public class FrequencyofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java program";
		int freq[] = new int[str.length()];
		char[] str1 = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			freq[i]=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str1[i]==str1[j])
				{
					freq[i]++;
					str1[j]=0;
				}
					
			}
		}
		System.out.println("Characters and their corresponding frequencies");
		for(int i=0;i<freq.length;i++)
		{
			if(str1[i]!=0&& str1[i]!=' ')
			System.out.println(str1[i]+"-"+freq[i]);
		}

	}

}
