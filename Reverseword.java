package assignment;
import java.util.Scanner;
public class Reverseword {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int start = -1;
		
		for(int i = 0;i< str.length();i++)
		{
			if(str.charAt(i)== ' ')
			{
				for(int j = i-1;j>start;j--)
				{
					System.out.print(str.charAt(j));
					
				}
				System.out.print(" ");
				start = i;
			}
			else if(i==str.length()-1)
			{
				for(int j = i;j>=start;j--)
				{
					System.out.print(str.charAt(j));
					
				}
			}
		}
	}

}
