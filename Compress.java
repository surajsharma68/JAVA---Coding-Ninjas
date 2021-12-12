package assignment;

import java.util.Scanner;

public class Compress {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		String result = "";
		String strr= "";
		
		for(;str.length()>0;)
		{
			int count =1;
			strr = "";
			int chr = 0;

			for(int j=chr+1;j<str.length();j++)
			{
				if(str.charAt(chr)==str.charAt(j))
				{
					
					
					count++;
				
				}
				
				if(str.charAt(chr)!=str.charAt(j))
				{
					strr = strr + str.charAt(j);
					
				}
				
			}
			
			result = result + str.charAt(chr);
			if(count>1)
			{
				result = result + count;
			}
			
			str = strr;
				
			

		}
		System.out.println(result);
	}

}
