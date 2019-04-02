package statickeyword;

public class StaticMethodChangeSvariable {
	static int num=5;
	static void change()
	{
		num=10;
		System.out.println(num);
	}
	public static void main(String args[])
	{
		StaticMethodChangeSvariable c=new StaticMethodChangeSvariable();
		c.change();
	}

}
