package multidimentionalArray;

public class CopyingArray {
	public static void main(String args[])
	{
		char arr[]={'a','b','c','d','e','f','g'};
		char arr1[]=new char[6];
		System.arraycopy(arr,1,arr1,0,6);
		System.out.println(String.valueOf(arr1));
	}
	

}
