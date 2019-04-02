package inheritance;
class Animal1
{
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog1 extends Animal1
{
	void bark()
	{
		System.out.println("barking...");
	}
}
class BabyDog extends Dog1
{
	void sleep()
	{
		System.out.println("sleeping...");
	}
}
public class TestInheritance1 {
	public static void main(String args[])
	{
		BabyDog b=new BabyDog();
		b.eat();
		b.bark();
		b.sleep();
	}

}
