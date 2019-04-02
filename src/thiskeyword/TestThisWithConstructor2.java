package thiskeyword;
class Demo2
{
	Demo2()
	{
		this(5);
		System.out.println("hello");
	}
	Demo2(int x)
	{
		System.out.println(x);
	}
}

public class TestThisWithConstructor2 {
	public static void main(String args[])
	{
		Demo2 d= new Demo2();
		System.out.println(d);
	}

}
