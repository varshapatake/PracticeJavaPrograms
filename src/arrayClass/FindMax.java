package arrayClass;

import java.util.Scanner;

public class FindMax {
	public static void main(String args[])
	{   int size;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter Size of array");
	  size=scan.nextInt();
	  int arr[]=new int[size];
	  
	  System.out.println("Enter "+size+"elements");
	  for(int i=1;i<arr.length;i++)
	  {
		  arr[i]=scan.nextInt();
	  }
		
	  int max=arr[0];
	  for(int j=1;j<arr.length;j++)
	  {
		  if(max<arr[j])
		  {
			  max=arr[j];
		  }
	  }
	  System.out.println("max value is: "+max);
	  
	}

}
