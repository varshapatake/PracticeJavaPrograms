package finalkeyword;

public class FinalParameter {
	int num;
	
	FinalParameter(final int num)
	{
		this.num=2+num;
		//num=num+2;   can not change value of final parameter
		System.out.println(this.num);
	}
	public static void main(String args[])
	{
		FinalParameter f=new FinalParameter(10);
	}
}
