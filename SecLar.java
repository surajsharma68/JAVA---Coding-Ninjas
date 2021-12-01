package arraysassignment;

import java.util.Scanner;

public class SecLar {
	public static int[] Array(int n)
	{
		Scanner sc2 =new Scanner(System.in);
		int out[] = new int[n];
		for(int i=0;i<n;i++)
		{
			out[i] = sc2.nextInt();
		}
		return out;		
	}
	public static int Second(int arr[])
	{
		boolean same  =true;
		int n= arr.length;
		
		if(n<=1){
			return -2147483648;
		}
		
		int Largest = -2147483648;
		for(int i =0;i<n;i++)
		{
			if(arr[i]>Largest)
			{
				Largest = arr[i];
				same = false;
			}
		}
		int SecLarg = -2147483648;
		for(int i =0;i<n;i++)
		{
			if(arr[i]==Largest) {
				continue;
				
			}
			if(arr[i]>SecLarg)
			{
				SecLarg =arr[i] ;
				same = false;
			}
	
		}
		if(same) {
			return -2147483648;
		}
		return SecLarg;
		
	}
	

	public static void print(int arr[])
{
for(int i =0;i<arr.length;i++)
{
	System.out.print(arr[i] + " ");
}
}

public static void main(String args[])
{
	Scanner sc1 = new Scanner(System.in);
	int t =sc1.nextInt();
	for(int i =0;i<t;i++)
	{
		int a = sc1.nextInt();
		int[] ar3 = Array(a);
		int sec = Second(ar3);
		System.out.println(sec);
	
	}
}

}
