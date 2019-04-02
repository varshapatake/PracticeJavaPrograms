package superKeyword;

public class SampleSuperVariable {
	int num=14;
	void sum()
	{
		System.out.println(num);
	}

}
class Test1 extends SampleSuperVariable
{
	int sum=34;
	void display()
	{
		super.sum();
		System.out.println(super.num+sum);
	}
}
class Sample
{
	public static void main (String args[])
	{
	Test1 t=new Test1();
	t.display();
	}
}
