import java.util.Scanner;
public class Choice
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		if((n>=1) && (n<=12))
		{
		System.out.println("1 = Addition & 2 = Multiplication");
		int c =sc.nextInt();
		if((c>=1) && (c<=2))
		{
		int sum = 0;
		int prod = 1;
		
		if(c==1)
		{for (int k =1;k<=n;k++)
			sum=sum+k;
		}
		else
		{for (int k =1;k<=n;k++)
			prod = prod*k;
		}
		if(c==1){
		System.out.print("Sum is " + " " +sum);}
		if(c==2){
		System.out.print("Product is " + " " +prod);}
		}
		}
	}
	
}
	