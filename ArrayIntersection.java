package array;

import java.util.Scanner;

public class ArrayIntersection {
	public static int[] Intersection(int a)
	{
		Scanner sc1 =new Scanner(System.in);
		int arr1[] = new int[a]; // array 1
		
		int arr3[] = new int[a+1];         //output
		int h =0;
		for(int i =0;i<a;i++)
		{
			arr1[i] = sc1.nextInt();
		}
		int ar2 = sc1.nextInt();  //length of second array
		int arr2[] = new int[ar2];  // array 2
		for(int i =0;i<ar2;i++)
		{
			arr2[i] = sc1.nextInt();
		}
		for(int i =0;i<a;i++)
		{
			
			for(int j =0;j<ar2;j++)
			{
				if((arr2.length==1) && (i ==1) )
						{
					break;
						}
				
				if(arr1[i] == arr2[j] )
				{
					
					arr3[h] = arr1[i];
						h++;
						break;
				}
				
			}
		}
		
		
		return arr3;
		
		
		
	}
	public static void print(int arrr[])
	{
		for(int i =0;i<arrr.length;i++)
		{ 
			if(arrr[i]==0) {
				                      //to not print zeros
				continue;
			}
			System.out.print(arrr[i] + " ");
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		for(int k =1;k<=t;k++)
		{
			int n = sc.nextInt();
			int arr4[] = Intersection(n);
			print(arr4);
		}
	}

}
