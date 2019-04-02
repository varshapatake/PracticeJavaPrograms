package statickeyword;

public class WithoutStatic {
	int count=0;
	WithoutStatic(int count)
	{
		this.count=count;
		count++;
		System.out.println(count);
	}
	public static void main(String args[])
	{
		WithoutStatic a=new WithoutStatic(2);
		WithoutStatic b=new WithoutStatic(2);
		WithoutStatic c=new WithoutStatic(2);
		
	}

}
