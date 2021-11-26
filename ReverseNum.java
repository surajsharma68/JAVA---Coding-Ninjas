import java.util.Scanner;
public class ReverseNum
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i =1;
    while(n%10==0) 
    {n =n/10;
    continue;
    }
	while (n!=0) {
	int temp = n%10;
	System.out.print(temp);
	n=n/10;
	}
    
	}
}