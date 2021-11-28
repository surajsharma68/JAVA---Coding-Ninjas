package array;
import java.util.Scanner;
public class Arraysum {
	public static int[] Array()
	{
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i] = sc.nextInt();
			
		}
		return arr1;
	}
	public static int Sum(int arr2[]) {
		int sum = 0;
		for(int i =0;i<arr2.length;i++)
		{
			sum = sum +arr2[i];
		}
		return sum;
	}
	
	
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		int n = sc1.nextInt();
		int arr4[] = new int[n];
		for (int i =1;i<=n;i++)
			
		{
			int arr3[] = Array();
			int sum1 = 	Sum(arr3);
			
					arr4[i-1] = sum1;
			//System.out.println(arr3);
			//System.out.println(sum1);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr4[i]);
		}
			
	}

}
