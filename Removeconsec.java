package assignment;
import java.util.Scanner;
public class Removeconsec {
		
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
		char remo = ' ';
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != remo)
			{
				System.out.print(str.charAt(i));
				remo = str.charAt(i);
				
			}
		
		}
		
	}

}
