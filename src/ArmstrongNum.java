import java.util.Scanner;

public class ArmstrongNum {
	static boolean checkNumber(int n) {
		int digits =0,last=0,sum=0;
		int temp;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			digits++;
		}
		temp = n;
		while(temp>0)
		{
			last = temp%10;
			sum += (Math.pow(last,digits));
			temp=temp/10;
		}
		if(n==sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Armstrong num upto"+num+"are:");
		for(int i=0;i<=num;i++)
		{
			if(checkNumber(i))
				System.out.print(i+",");
		}
		

	}

}
