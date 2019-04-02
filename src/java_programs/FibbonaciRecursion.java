package java_programs;

public class FibbonaciRecursion {
	
	static int n1=0,n2=1,n3;	
	static void fibbonaci(int c)
	{
		if(c>0)
		{
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		fibbonaci(c-1);
		}
		
	}
	public static void main(String args[])
	{
		int count=10;
		System.out.print(" "+n1+" "+n2);
		fibbonaci(count-2);
	}

}
