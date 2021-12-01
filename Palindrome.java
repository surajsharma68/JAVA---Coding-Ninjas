package strings;
import java.util.Scanner;

public class Palindrome {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String str = sc.next();
	  int len = str.length()-1;
	  int i,j;
		for( i =len,j=0;i>0;i--)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				j++;
			}
		}
		if(j==len)
		{
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}

}
