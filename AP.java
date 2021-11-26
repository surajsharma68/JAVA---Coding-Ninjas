import java.util.Scanner;
public class AP
{
public static void main(String args[])
{Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int i =1;
while(i<=n)
	
{
	int an = 3*i + 2;
if(an%4==0) {
	i++;
	n++;
	continue;}
System.out.print(an +" ");


i=i+1;
}
}
}
	