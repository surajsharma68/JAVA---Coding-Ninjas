package searchingsorting;
import java.util.Scanner;
public class MergingTwo {
	public static void Merge(int ar1[],int ar2[])
	{
		int[] ar3 = new int[(ar1.length )+ (ar2.length)] ;
		int k= 0;
		int i,j;
		for(i=0,j=0;i<ar1.length && j <ar2.length;)
		{
			if(ar1[i]<ar2[j])
			{
				ar3[k]=ar1[i];
				k++;
				i++;
			}
			else {
				
				ar3[k] = ar2[j];
				k++;
				j++;
						
			}
		

		}
		while(i<ar1.length)
		{
			ar3[k] = ar1[i];
					k++;
					i++;
		}

		print(ar3);
		System.out.println();
	}
	public static void print(int ar[]) 
	{
		for(int i =0;i<ar.length;i++)
		{
			System.out.print(ar[i] + " ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int[] arr1 = {2,6,9,15};
		int[] arr2 = {1,4,6,7};
		Merge(arr1,arr2);
	}

}
