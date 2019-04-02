package superKeyword;
class Color
{
	String color="pink";
}
class Color1 extends Color
{
	String color="black";
	void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class TestSuper {
	public static void main(String args[] )
	{
		Color1 c=new Color1();
		c.display();
	}

}
