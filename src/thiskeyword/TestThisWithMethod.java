package thiskeyword;
class Demo
{
	void m()
	{
		System.out.println("hello m");
	}
	
	void n()
	{
		System.out.println("hello n");
		this.m();
	}
}

public class TestThisWithMethod {
	public static void main(String args[])
	{
		Demo d=new Demo();
		d.n();
	}

}
