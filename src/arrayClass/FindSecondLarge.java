package arrayClass;

public class FindSecondLarge {
public static void main(String args[])
{
	int arr[]={12,34,56,36,45,55};
	int max=0,second_large=0;
	for(int i=0;i<arr.length;i++)
	{
		if(max<arr[i])
		{  
			second_large=max;
			max=arr[i];
		}
		else if(arr[i]>second_large&&arr[i]!=max)
		{
			second_large=arr[i];
		}
	}
	System.out.println("large:"+max+" \nsecond_large:"+second_large);
}
}
