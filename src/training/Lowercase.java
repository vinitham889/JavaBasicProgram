package training;

import java.util.Vector;

public class Lowercase {

        public static String lowercase(String s) {
		        String name = "";
		        char ch = ' ';
		        for (int i = 0; i < s.length(); i++) {
		            
		            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
		                ch = (char)(s.charAt(i) + 32);
		                //ch = (char)(s.chartAt(i)-32);//upper case
		            }
		            else {
		                ch = (char)(s.charAt(i)-32);
		            }
		            
		            name += ch; 
		        }
		        return name;
		    }

		    public static void main(String[] args) {
		              System.out.println(lowercase("VINITHA"));
		              Vector v1 = new Vector();
		              v1.add("vini");
		    }
		}
