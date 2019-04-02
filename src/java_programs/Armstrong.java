package java_programs;

import java.util.Scanner;

public class Armstrong {
	public static void main(String args[])
	{   
		int re,temp,sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("enter a number");
		int n=in.nextInt();
		temp=n;
		while(n!=0)
		{
			re=n%10;
			sum = sum+(re*re*re);
			n=n/10;		
		}
		if(temp==sum)
		{
			System.out.println(temp+" is an amrstrong number");
		}
		else
		{
			System.out.println(temp+" is not an amrstrong number");
		}
	}

}
