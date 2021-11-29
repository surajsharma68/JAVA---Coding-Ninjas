package array;
import java.util.Scanner;
public class SwapAlternate {
	public static int[] Swap(int n)
	{
		int arr1[] = new int[n];
		Scanner sc =new Scanner(System.in);
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		
		
		for(int k =0,y =1;y<n;y= y+2,k= k +2)
			
		{
			arr1[k] = arr[y];
			arr1[y] = arr[k];
		}
		if(n%2==1) {
		arr1[arr.length-1] = arr[arr.length-1];
		}
		}
		return arr1;
	}
	public static void Print(int arrr[])
	{for(int i =0;i<arrr.length;i++)
		
	{
		System.out.print(arrr[i] + " ");
	}
	}
	public static void main(String args[])
	{
		Scanner sc1 = new Scanner(System.in);
		int t = sc1.nextInt();
		for (int u =1;u<=t;u++)
		{
			int o = sc1.nextInt();
			int arrrr[] = Swap(o);
			Print(arrrr);
			
		}
	}

}
