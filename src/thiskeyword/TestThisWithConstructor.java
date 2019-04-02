package thiskeyword;
class Demo1
{
	Demo1()
	{
		System.out.println("Hello varsha");
	}
	Demo1(int x)
	{
		this();
		System.out.println(x);
	}
}

public class TestThisWithConstructor {
	public static void main(String args[])
	{
		Demo1 d1=new Demo1(100);
	}

}
