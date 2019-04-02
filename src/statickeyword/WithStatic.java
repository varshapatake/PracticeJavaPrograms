package statickeyword;

public class WithStatic {
static int count=0;
WithStatic()
{

	count++;
	System.out.println(count);
}
public static void main(String args[])
{
	WithStatic a=new WithStatic();
	WithStatic b=new WithStatic();
	WithStatic c=new WithStatic();
	
}
}
