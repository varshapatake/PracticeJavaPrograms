package java_programs;

import java.util.Scanner;

public class PalindromString {
public static void main(String args[])
{
	String original,reverse="";
	int i;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter any string");
	original=in.nextLine();
	int l=original.length();
	for(i=l-1;i>=0;i--)
	{   
		reverse=reverse+original.charAt(i);
	}
	if(original.equals(reverse))
	{
		System.out.println(original+" is palindrom");
	}
	else
	{
		System.out.println(original+" is not palindrom");
	}
}
}
