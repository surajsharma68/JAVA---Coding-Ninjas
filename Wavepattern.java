package twoDArrays;
import java.util.Scanner;
public class Wavepattern {
	public static int[][] Array2d(int a,int b)
	{
		Scanner sc1 = new Scanner(System.in);
		int[][] arr = new int[a][b];
		for(int i =0;i<a;i++)
		{
			for(int j =0;j<b;j++)
			{
				arr[i][j] = sc1.nextInt();
			}
		}
		return arr;
	}
	public static void Wave(int arrr[][])
	{
		int rows = arrr.length;
		int column = arrr[0].length;
		
		for(int i =0;i<column;i++)
		{
			if(i%2>0)
			{
				for(int j =rows-1;j>=0;j--)
				{
					System.out.print(arrr[j][i] + " ");
				}
			}
			if(i%2==0)
			{
				for(int j =0;j<rows;j++)
				{
					System.out.print(arrr[j][i] + " ");
				}
			}
		}
		
	}
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++)
		{
			int a1 = sc.nextInt();
			int b1 = sc.nextInt();
			int waved[][] = Array2d(a1,b1);
			Wave(waved);
		}
				
	}

}
