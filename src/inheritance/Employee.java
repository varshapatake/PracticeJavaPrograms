package inheritance;
class Employee1
{
	float salary=5000;
}

public class Employee extends Employee1{
	int bonus=2000;
	public static void main(String args[])
	{
		Employee e=new Employee();
		System.out.println(e.salary);
		System.out.println(e.bonus);
			
	}

}
