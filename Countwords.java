package strings;
import java.util.Scanner;
public class Countwords {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		for(int i =0;i<str.length();i++)
		{

			if(str.charAt(i) == ' ')
			{
				count++;
			}

		}
		
		System.out.println(count+1);
	}

}
