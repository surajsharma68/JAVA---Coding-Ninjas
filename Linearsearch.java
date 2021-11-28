package array;

import java.util.Scanner;

public class Linearsearch {
	public static int[] Array()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i = 0;i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}
		return arr1;
		
	}
	public static int Linear(int arrr[], int x)
	{
		int y = arrr.length;
		int a = 0;
		for (int k = 0;k<arrr.length;k++)
		{
			if(x == arrr[k])
			{ 
				 a = k;
				break;
			}
			else if (k == y-1)
			{
				 a = -1;
			}
			
			}
		return a;
	}
	
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		int t = sc1.nextInt();
		int arr3[] = new int[t];
		for (int i=1;i<=t;i++)
		{
			int arr2[] = Array();
			int x1  = sc1.nextInt();
			int u = Linear(arr2,x1);
			arr3[i-1] = u;
			
		}
		for(int k =0;k<t;k++)
		{
			System.out.println(arr3[k]);
		}
	}
}
		


