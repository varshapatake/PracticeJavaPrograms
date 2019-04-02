package abstractClass;

abstract public class AbstractClass {
	abstract void run();
	void display()
	{
		System.out.println("This is an abstract class");
	}
}

class Bike1 extends AbstractClass
{
	void run()
	{
		System.out.println("bike is running");
	}
	public static void main(String args[])
	{
		AbstractClass a=new Bike1 ();
		a.display();
		a.run();
	}
}