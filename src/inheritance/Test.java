package inheritance;

public class Test {
	void marks()
	{
		System.out.println("70");
	}

}
class Student extends Test
{
	void student()
	{
		System.out.print("Arti:");
	}
}
class Sample 
{
	public static void main(String args[])
	{
		Student s=new Student();
		s.student();
        s.marks();
	}
}
