package assignment;

import java.util.Scanner;

public class CompressConsec {
	
		public static void main(String args[])
		{
			Scanner sc =new Scanner(System.in);
			String str = sc.next();
			String result = "";
			for(int i =0;i<str.length();i++)	
			{
				int count=1;
				
				for(;i<str.length()-1 && str.charAt(i) == str.charAt(i+1);i++)
				{
					count++;
				}
				
				result = result + str.charAt(i);
				if(count>1)
				{
					result = result + count;
				}
				
				
			}
			
		System.out.println(result);
		}
	}



