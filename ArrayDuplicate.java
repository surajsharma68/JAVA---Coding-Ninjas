package array;
import java.util.Scanner;
public class ArrayDuplicate {
	public static int Duplicate(int a)
	{
		Scanner sc1 = new Scanner(System.in);
		int arr[] = new int[a];
		int t =0;
		for(int i =0;i<a;i++)
		{
			arr[i] = sc1.nextInt();		
		}
		for(int i =0;i<a;i++)
		{
			for(int j =0;j<a-1;j++) {
				if (i==j) {
					continue;
				}
			else if(arr[i]== arr[j])
			{
				t= arr[j];
			}
			}
		}
		return t;
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int r = sc.nextInt();
		int dupli[] = new int[r];
		for(int i =1;i<=r;i++)
		{
			int y = sc.nextInt();
			int z = Duplicate(y);
		    dupli[i-1] = z;
		}
		
		for(int m =0;m<dupli.length;m++)
{
	 System.out.println(dupli[m]);
}
}
		
	}


