package java_programs;

public class BubbleSort {
	static void bubblesort(int arr[])
	{
		int temp=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				
			}
		}
	}
	public static void main(String args[])
	{
		int arr[]={10,45,34,46,56};
		System.out.println("Array before sorting");
		for(int i=0;i< arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("Array after sorting");
		bubblesort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}

}
