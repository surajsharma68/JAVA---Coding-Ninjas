package array;

import java.util.Scanner;

public class ArrayPairSum {
	
	public static int Pair(int a)
	{
		Scanner sc1 = new Scanner(System.in);
		int arr[] = new int[a];
		int count = 0;
		
		for(int i =0;i<a;i++)
		{
			arr[i] = sc1.nextInt();
		}
		int x = sc1.nextInt();
		
		for(int i=0;i<a;i++)
		{
			for(int j=i;j<a;j++)
			{ if(i==j) {
				
				continue;
			}
				
				if(((arr[i]) + (arr[j])) == x )
				{
					count = count +1;
				}
			}
		}
		
		return count;
	}
	public static void print(int arr[])
	{
	 for(int i =0;i<arr.length;i++)
	 {
		 System.out.println(arr[i]);
	 }
	}
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		int arr2[] = new int[t];
		for(int a =1;a<=t;a++)
		{
			int n = sc.nextInt();
			int k = Pair(n);
			arr2[t-1] = k;
		}
		print(arr2);
	}

}
