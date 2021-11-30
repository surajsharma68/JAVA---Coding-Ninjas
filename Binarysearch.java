package searchingsorting;
import java.util.Scanner;

public class Binarysearch {
	public static int[] BinarySearch(int n)
	{
		Scanner sc =new Scanner (System.in);
		int arr[] = new int[n];
		int ans = -1;
		int arrr[] = new int[n];
		int count = 0;
		
		for(int i =0;i<n;i++)
		{
			//if(arr[i]<arr[i+1])
			arr[i] = sc.nextInt();
		}
		int end = arr.length;
		
		int t = sc.nextInt(); // number of cases to search
		
		for(int l  = 0;l<t;l++)
		{
			int x = sc.nextInt();  // element to be searched
		
		for(int start =0;start<end;)
		{
			int mid = ((start+end)/2);
			if (arr[mid] == x) {
				ans = mid;
				break;
			}
			else if(arr[mid] < x)
			{
				start = mid+1 ;
			}
			else if(arr[mid] > x)
			{
				end = mid-1;
			}
			else  {
				ans = -1;
			}
			
		}
		
		arrr[count] = ans;
		count= count+1;
		
		}
		return arrr;
		
		
	}
	
	public static void print(int ar[])
	{
		for(int i = 0;i<ar.length;i++)
		{
			if((ar[i]==0) && (i>0)) {
				continue;
			}
			System.out.println(ar[i] );
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int e = sc.nextInt();
		int arr1[] =BinarySearch(e);
		print(arr1);
		
	}

}
