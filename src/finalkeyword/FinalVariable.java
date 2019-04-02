package finalkeyword;

public class FinalVariable {
	final int num=15;
	void display()
	{
		System.out.println(num);
	}
	public static void main(String args[])
	{
		FinalVariable a=new FinalVariable();
		a.display();
	}

}
