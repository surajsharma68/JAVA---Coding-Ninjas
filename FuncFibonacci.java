import java.util.Scanner;
public class FuncFibonacci
{
	public static void fibonacci(int n) {
		int n1 = 0;
		int n2 =1;
		
		for (int k=1;n2<n;k++)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		if(n2 == n) {
		System.out.print("True");}
		else
		{System.out.print("False");
	}
	}    
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		fibonacci(u);
	
}
}