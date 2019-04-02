package methodoverloading;
class Sample
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(int a,int b,int c)
	{
		return a+b+c;
	}
}

public class Addtion {
	public static void main(String args[])
	{
		System.out.println(Sample.add(4,7));
		System.out.println(Sample.add(7,5,6));
	}

}
