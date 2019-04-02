package java_programs;

import java.util.Scanner;

public class FactorialRecusion {
	static int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	
	public static void main(String args[])
	{
		int no,fact;
		Scanner in =new Scanner(System.in);
		System.out.println("enter any number");
		no=in.nextInt();
		fact=fact(no);
		System.out.println("factorial of"+no+" is:"+fact);
		
		
	}
}
