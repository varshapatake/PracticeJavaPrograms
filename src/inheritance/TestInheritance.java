package inheritance;
class Animal
{
	void eat()
	{
		System.out.println("eating.....");
	}
}

class Dog extends Animal
{
	void dog()
	{
		System.out.println("bitting....");
	}
}

public class TestInheritance {
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.eat();
		d.dog();
	}
}
