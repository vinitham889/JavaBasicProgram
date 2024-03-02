import java.util.Scanner;

public class Factorial {
		static int fact(int n)
		{
			if(n==0)
			return 1;
			else 
			return(n*fact(n-1));
			
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int num = sc.nextInt();
			int factorial = fact(num);
			System.out.println("The factorial entered is :"+factorial);
			sc.close();
			}
		

}
