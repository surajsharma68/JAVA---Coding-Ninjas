package array;

import java.util.Scanner;

public class SortZeroes {
	public static int[] Sort01(int a)
	{
		Scanner sc1 = new Scanner(System.in);
		int place = 0;
		int arr[] = new int[a];
		for(int i =0;i<a;i++)
		{
			arr[i] = sc1.nextInt();
		}
		
		for(int i =0;i<a;i++)
		{
			if(arr[i] == 0)
			{
				arr[place] = 0;
				place = place+1;
			}
			
		}
		for(place =place;place<a;place++)
		{ 
			arr[place] = 1;
		}
		return arr;
			
	}
	public static void print(int ar[])
	{
		for(int i = 0;i<ar.length;i++)
		{
			System.out.print(ar[i] + " ");
		}
	}
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1;i<=t;i++)
		{
			int n = sc.nextInt();
			int arrr[] = Sort01(n);
			print(arrr);
				
		}
	}

}
