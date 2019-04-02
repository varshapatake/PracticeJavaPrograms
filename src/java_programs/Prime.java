package java_programs;

public class Prime {
	public static void main(String args[])
	{
	int n=8 ,i,count=0;
	for(i=1;i<=7;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println(n+" is a prime number");
	}
	else
	{
		System.out.println(n+" is not a prime number");
	}
	}
}
