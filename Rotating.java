package arraysassignment;
import java.util.Scanner;
public class Rotating {
	public static void Rotating(int arr[])
	{
		Scanner sc = new Scanner(System.in);
		int n =arr.length;
		int times = sc.nextInt(); // the value  by which the array needs to be rotated.

		int temp=0;
		int tem[] = new int[arr.length];
		for(int i =0;i<times;i++)	
		{
			tem[n-times] = arr[i];
					n++;
		}
		int u = 0;
		for(int j =times;j<n-times;j++)
		{
			tem[u] = arr[j];
					u++;
		}
		print(tem);
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
		int ar1[] = {1,2,3,4,5,6,7};
		Rotating(ar1);
		
	}

}
