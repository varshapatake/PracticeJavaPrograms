package java_programs;

public class Palindrom {
	static int n=344,sum=0,re,temp;
	public static void main(String args[])
	{   
		temp=n;
		while(n>0)
		{
		re=n%10;
		sum=(sum*10)+re;
		n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println(temp+" is a palindrom");
		}
		else
		{
			System.out.println(temp+" is not a palindrom");
		}
	}

}
