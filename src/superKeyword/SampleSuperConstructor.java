package superKeyword;

public class SampleSuperConstructor {
	
	SampleSuperConstructor()
	{
		System.out.println("Super class constructor");
	}
}
class Sample2 extends SampleSuperConstructor
{  
	
	Sample2()
	{
		super();
		System.out.println("child class constructor");
	}
}
class Test
{
	public static void main(String args[])
	{
		Sample2 s=new Sample2();
	}
}
