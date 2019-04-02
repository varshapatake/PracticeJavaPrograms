package inheritance;

class A
{
	void msg()
	{
		System.out.println("msg");
	}
}
class B
{
	void msg()
	{
		System.out.println("msg");
	}
}
public class MultipleInheritance extends A
{
	public static void main(String args[])
	{
		A a=new A();
		a.msg();
	}

}

