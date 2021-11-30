package array;

import java.util.Scanner;

public class ArrayTripSum {
	public static int[] Array(int n)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static int TripSum(int arr1[])
	
	{
		Scanner sc =new Scanner(System.in);
		int x = sc.nextInt();
		int count = 0;

		for(int i =0;i<arr1.length;i++)
		{
			for(int k =i;k<arr1.length;k++) {
				if(k==i)
				{
					continue;
				}
			
				for(int j =k;j<arr1.length;j++)
				{
					if(k==j)
					{
						continue;
					}
				

					else if(x == arr1[j] + arr1[k] +arr1[i])
					{
						count = count +1;
					}
				  }
			}
				
				
			}
		return count;
		}
	
	public static void print(int arrrr[])
	{
		for(int i =0;i<=arrrr.length;i++)
		{
			System.out.println(arrrr[i]);
		}
	}
	
	

	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		int t = sc1.nextInt();
		for(int i =1;i<=t;i++)
		{
			int n = sc1.nextInt();
			int arrr[] = Array(n);
			int k = TripSum(arrr);
			System.out.println(k);

		}
		
	}

}
