package finalkeyword;

public class BlankFinalVariable {
	final int num;
	BlankFinalVariable()
	{
		num=10;
		System.out.println(num);
	}
	public static void main(String args[])
	{
		BlankFinalVariable b=new BlankFinalVariable();
	}
}
