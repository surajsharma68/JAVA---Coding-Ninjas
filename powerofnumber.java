package Assignloop;
import java.util.Scanner;
public class powerofnumber {
public static void main(String args[])
{Scanner sc = new Scanner(System.in);
	int  num = sc.nextInt();
	int  pwr = sc.nextInt();
	int prod= num;
	int t = 1;
	while (t<pwr)
	{prod = prod*num;	
	t = t+1;}
	System.out.println(prod);}}
