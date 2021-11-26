package Assignloop;
import java.util.Scanner;
public class totalSalary {
public static void main(String args[])
{System.out.println("WAP to calculate the total salary of a person. ");
	Scanner sc = new Scanner(System.in);
	int bsalary = sc.nextInt();

	
	char  grade = sc.next().charAt(0);
	if ((bsalary>=0) && (bsalary<7500000) && (grade<=67) && (grade>=65))
	{
	int hra = ((20*bsalary)/100);
	int da = ((50*bsalary)/100);
	
	int pf = ((11*bsalary)/100);
	
	int grad = grade;
	if (grad ==65)
	{bsalary = bsalary + 1700;
	}
	else if (grad ==66)
	{bsalary = bsalary + 1500;
	}
	else
	{bsalary = bsalary + 1300;
	}
	
	int tsalary = (bsalary + hra + da -pf);
		System.out.println("Total Salary is: " + "\t" + tsalary);
	}
	else
	{System.out.println("Please Input grade as A,B or C");
	
	}
}
}

