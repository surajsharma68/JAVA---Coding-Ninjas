import java.util.Scanner;
public class Binarytodecimal
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int i =1;
		while(n!=0)
		{if((n%10==0) || (n%10==1)){ 
	
			sum = ( sum+ (n%10)*i);
		i =i<<1;}
		n=n/10;
		
		}
		if ((n/10==0) && ((n%10==0) || (n%10==1)))
		{sum = sum+ (n%10)*i;}
	System.out.print(sum);
	}
}
		