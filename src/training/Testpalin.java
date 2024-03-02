package training;

import java.util.Scanner;

class HelloWorld {
    public static  boolean palin(String str)
    {
        String[] str1 = str.split("\\s");
        String reverseStr ="";
        for(int i=str1.length-1;i>=0;i++)
        {
        	reverseStr  +=  str1.length;
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter str");
        String str=sc.nextLine();
        if(palin(str))
        {
            System.out.println("is palin");
        }
        else
        {
            System.out.println("not palin");
        }
        
       
       
       }
       
    }
