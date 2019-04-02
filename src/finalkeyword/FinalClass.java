package finalkeyword;

public final class FinalClass {
void display()
{
	System.out.println("final class");
}
}
class FinalClass1
{
}
class Sample3 extends FinalClass1
{
	Sample3()
	{
		System.out.println("final class can't be overriden");
	}
}
class Sample4
{
	public static void main(String args[])
	{
		Sample3 s=new Sample3();
	}
}
