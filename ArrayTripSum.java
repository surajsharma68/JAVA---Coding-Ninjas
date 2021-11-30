//You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.

 //Note :
 //Given array/list can contain duplicate elements.

// Input format : 
//  The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

//First line of each test case or query contains an integer 'N' representing the size of the first array/list.

//Second line contains 'N' single space separated integers representing the elements in the array/list.

//Third line contains an integer 'X'.

//Output format : 
//For each test case, print the total number of triplets present in the array/list.

//Output for every test case will be printed in a separate line.

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

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
