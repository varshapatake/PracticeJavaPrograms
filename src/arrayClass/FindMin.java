package arrayClass;

import java.util.Scanner;

public class FindMin {
	public static void main(String args[])
	{  
		int size,index=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array:");
		size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+"numbers");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int min=arr[0];
		for(int j=1;j<arr.length;j++)
		{
			if(min>arr[j])
			{
				min=arr[j];
				index=j;
			}
		}
		System.out.println("min no is:"+min+" found at location "+index);
	}

}
