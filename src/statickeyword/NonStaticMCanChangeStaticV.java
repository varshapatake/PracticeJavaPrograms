package statickeyword;

public class NonStaticMCanChangeStaticV {
	static int num=5;
    void change()
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
