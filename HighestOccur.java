package assignment;

import java.util.Scanner;

public class HighestOccur {
	public static void main(String args[])
	{
//		Given a string, S, find and return the highest occurring character present in the given string. 
//		If there are 2 characters in the input string with same frequency, return the character which comes first.
//	    Sample Input 1:
//		abdefgbabfba
//
//		Sample Output 1:
//		b
		
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		char ans = ' ';
		int max =0;
		
		for(int i=0;i<str.length();i++)
		{
			int count =0;
			for(int j=i;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
				
				else if (count>=max)
				{
					max = count;
				    ans = str.charAt(i);
				}

			}
		}
	}
}
