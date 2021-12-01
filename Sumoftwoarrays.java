package arraysassignment;

import java.util.Scanner;

public class Sumoftwoarrays {
	public static void Sum(int ar1[],int ar2[])
	{
	int len =0;
	int limit1 = 0;
	int n1 = ar1.length;
	int n2 = ar2.length;
	if(n1>n2) {
	len =n1;
	
	}
	if(n1<n2) {
		len =n2;
		}
	int ar3[] = new int[len+1];
	int n3= ar3.length;
	if(n1<=n2) {
        limit1=n1;}
    else
        {limit1=n2;}
	

	int carry = 0;
		for(int i =0;i<limit1;i++)
		{
			ar3[n3-i-1] = ((ar1[n1-i-1]) + (ar2[n2-i-1]) +carry)%10;
			carry = ((ar1[n1-i-1]) + (ar2[n2-i-1]))/10;
		} 
		
		  if(n1>n2)
	        {    for(int i=n2;i<n1;i++)
	            {
	                ar3[n3-i-1]=(ar1[n1-i-1]+carry)%10;
	                carry=(ar1[n1-i-1]+carry)/10;
	            }
	        }
	        else if(n1<n2)
	        {    for(int i=n1;i<n2;i++)
	            {
	                ar3[n3-i-1]=(ar2[n2-i-1]+carry)%10;
	                carry=(ar2[n2-i-1]+carry)/10;
	            }
	        }

        ar3[0]=carry;

	

	print(ar3);
	
	}
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
		int ar8[] = Array(a);
		int b = sc1.nextInt();
		
		int ar9[] = Array(b);
		Sum(ar8,ar9);
		}
		
	}

}