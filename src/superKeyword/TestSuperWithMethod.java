package superKeyword;
class Animal
{
	void eat()
	{
		System.out.println("eating....");
	}
}
class Animal1 extends Animal
{
	void eat()
	{
		System.out.println("Dog is eating...");
	}
	void bark()
	{
		System.out.println("barking....");
	}
	void work()
	{
		bark();
		super.eat();
	}
	
}

public class TestSuperWithMethod {
	public static void main(String args[])
	{
		Animal1 a=new Animal1();
		a.work();
	}

}
