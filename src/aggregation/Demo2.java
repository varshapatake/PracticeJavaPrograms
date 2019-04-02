package aggregation;
class Address
{
	String city,state,country;
	public Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}
class Emp
{
	int empno;
	String name;
	Address address;
	
	public Emp(int empno,String name,Address address)
	{
		this.empno=empno;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println(empno+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
}

public class Demo2 {
	public static void main(String args[])
	{
		Address a=new Address("amaravti","maharastra","India");
		Emp e=new Emp(111,"varsha",a);
		e.display();
	}
	

}
