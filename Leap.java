package crt;
import java.util.Scanner;
public class Leap {
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a year: ");
	int year=scanner.nextInt();
	if((year%400==0)||(year%4==0 && year%100 !=0))
			{
		System.out.println("it is a leap year");
		
			}
	else {
		System.out.println("it is not year");
	}

}
}