package java_programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		int n,i,f=1;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter any number");
		n=in.nextInt();
		
		for(i=n;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("factorial of "+n+" is "+f);
	}

}
