package training;

public class CountCharacter {
	//1. convert the string “aaabbccccd” to “a3b2c4d1” 

	public static void main(String[] args) {
       String str = "aaabbccccd";
       int n= str.length();
       for(int i=0;i<n;i++)
       {
    	   int count =1;
    	   while(i<n-1&&str.charAt(i)==str.charAt(i+1))
    	   {
    		   count++;
    		   i++;
    	   }
    	   System.out.print(str.charAt(i)+""+count);
       }
       
		

	}

	}

