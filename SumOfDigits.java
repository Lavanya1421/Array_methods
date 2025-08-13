package crt;
import java.util.Scanner;
public class SumOfDigits
{
	public static void main(String args[])
	{
	int sum=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the digits:");
	int n=scanner.nextInt();
	
	while(n!=0)
	{
	int i=n%10;
	sum+=i;
	n/=10;
	}
	System.out.println("The sum of the digits is :"+sum);
	scanner.close();
	}
	}

