package assignment;

import java.util.Scanner;

public class Removchar {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		char remo = sc.next().charAt(0);
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != remo)
			{
				System.out.print(str.charAt(i));

			}
		}
	}
}
