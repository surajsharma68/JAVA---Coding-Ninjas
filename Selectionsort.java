package searchingsorting;

import java.util.Scanner;

public class Selectionsort {
	public static int[] Array(int n)  //Taking Input for the Array;
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[n];
		
		for(int i =0;i<n;i++)
		{
			 arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static int[] SelectSort(int arrr[]) // Sorting;
	{
		int temp  = 0;
		for(int i = 0;i<arrr.length;i++)
		{
			for(int j = i;j<arrr.length;j++)
			{
				if(i==j) {
					continue;
				}
//				else if ((arrr[i])<(arrr[j]))
//				{
//					
//				}
				else if ((arrr[i])>(arrr[j]))
				{
					temp = arrr[i];
							arrr[i] = arrr[j];
									arrr[j] = temp;
				}
				
			}
			
		}
		return arrr;
	}
	public static void print(int ar[]) // Printing the Array;
	{
		for(int i =0;i<ar.length;i++)
		{
			System.out.print(ar[i] + " ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();     // Test cases;
		for(int i =0;i<t;i++) {
		int n = sc.nextInt();
		int ar1[] = Array(n);
		int ar2[] = SelectSort(ar1);
		print(ar2);
		}
				
	}

}
