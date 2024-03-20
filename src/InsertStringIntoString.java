
public class InsertStringIntoString {
	public static String insert_Str(String org , String inStr,int index) {
		
		String newString = "";
		for(int i=0;i<org.length();i++) {
			newString += org.charAt(i);
			if(i==index)
			{
				newString += inStr;
				
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		String org = "computer  program";
		String instr = "science";
		int index = 8;
		System.out.println(insert_Str(org,instr,index));

	}

}
