package training;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		System.out.println("The Fizz, Buzz, and FizzBuzz numbers are: ");  
		for(int i=0;i<=n;i++) {
			if(i%3==0&&i%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
		System.out.print(","+" ");

	}

}
