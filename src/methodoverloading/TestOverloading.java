package methodoverloading;
class Adder
{
	static int add(int a,int b)
	{
		return a+b;
	}
	static int add(double a,double b)
	{
		return (int) (a+b);
	}
}

public class TestOverloading {
	public static void main(String args[])
	{
		System.out.println(Adder.add(3, 5));
		System.out.println(Adder.add(4.5, 6.7));
	}

}
