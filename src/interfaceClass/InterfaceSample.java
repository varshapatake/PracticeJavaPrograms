package interfaceClass;


public class InterfaceSample {
	public static void main(String args[])
	{
		Test1 t=new Test1();
		t.display();
		Sample.display();
	}
}
interface Sample
{
  static void display()
  {
	  System.out.println("interface method");
  }
}
class Test1 implements Sample
{
	public void display()
	{
		System.out.println("test class");
	}
}
