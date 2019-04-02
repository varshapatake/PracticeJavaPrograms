package Encapsulation;

public class Encalsulation {
	private int num;//good practice to make data members private
	void setNum(int num)
	{
		this.num=num;
	}
	int getNum()
	{
		return num;
	}
}
class Sample
{
	public static void main(String args[])
	{
		Encalsulation e=new Encalsulation();
		e.setNum(6);//can't access private member outside of class that's why use public setter and getter method to access
		System.out.println(e.getNum());
	}
}
