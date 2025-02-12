package array_Manipulations;

import java.util.Scanner;

public class Array_Length_without_lengthProperty 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Elements");
		
		int count = 0;
		for(int a : arr)
		{
			arr[a] = s.nextInt();
			count++;
		}
		System.out.println("Count :" + count);
	}
}
