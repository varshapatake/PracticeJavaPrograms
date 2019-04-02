package student;
class Student
{
	int rollno;
	String name;
	float fee;
	Student(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+fee);
	}
}
class TestThisKeyword
{
	public static void main(String args[])
	{
		Student s1=new Student(111,"varsha",500);
		Student s2=new Student(222,"geeta",234);
		s1.display();
		s2.display();
		
		
	}
}