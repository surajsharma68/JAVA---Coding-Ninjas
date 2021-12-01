package arraysassignment;
import java.util.Scanner;
public class Pushzeroes {
	public static int[] Array(int n)
	{
		Scanner sc =new Scanner(System.in);
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void Push(int arrr[]) {
		int ar1[] = new int[arrr.length];
		int k=0,j=0,i=0;
		for(i =0;i<arrr.length;i++)
		{
			
			if(arrr[i] != 0)
				
			{
				arrr[j] = arrr[i];
				j++;
			}

		}
		
		while(j<arrr.length)
		{
			arrr[j] = 0;
			j++;
		}
		
		print(arrr);
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
		Scanner sc1 =new Scanner(System.in);
		int t = sc1.nextInt();
		for(int i = 0;i<t;i++)
		{
		int a = sc1.nextInt();
		int ar2[] = Array(a);
		Push(ar2);
		}
	}

}
