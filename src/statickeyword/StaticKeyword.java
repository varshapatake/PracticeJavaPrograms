package statickeyword;

public class StaticKeyword {
	int roll_no;
	String name;
	static String college="PRMITR";
	
	StaticKeyword(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
	void display()
	{
		System.out.println(roll_no+" "+name+" "+college);
	}
	public static void main(String args[])
	{
		StaticKeyword sk=new StaticKeyword(111,"varsha");
		StaticKeyword ss=new StaticKeyword(222,"arti");
		sk.display();
		ss.display();
	}

}
