package finalkeyword;

public class FinalMethod {
	final void display()
	{
		System.out.println("super class method");
	}
}
class Sample extends FinalMethod
{
	void display1(){
		System.out.println("can't override final method");	
	}
}
class Sample1
{
public static void main(String args[])
{
	Sample s=new Sample();
	s.display();
	s.display1();
}
}