import java.util.Scanner;

public class PalinArray {
	public static void main(String[] args) {
		 int arr[];
		 int n=0,i=0,rem =0,temp=0,reverseArr=0;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter size of array");
		 n = sc.nextInt();
		 arr = new int[n];
		 System.out.println("Enter element of array");
		 for(i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
			 
		 }
		 System.out.println("palindrome Elements in an array");
		 for(i=0;i<n-1;i++) {
			 temp = arr[i];
			 reverseArr=0;
			 while(temp!=0) {
				 rem = temp%10;
				 reverseArr *= 10+rem;
				 temp = temp/10;
			 }
			
			 
		 }
		 if(arr[i]==reverseArr) {
			 System.out.println(n+" ");
		 }
		 
		}  
		} 
		
	
