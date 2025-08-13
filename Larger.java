package crt;
import java.util.*;
public class Larger {
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter First value: ");
	int n1=scanner.nextInt();
	System.out.println("Enter second value: ");
	int n2=scanner.nextInt();
	System.out.println("enter third value: ");
	int n3=scanner.nextInt();
	if(n1>n2 && n1>n3)
		System.out.println("...First num is larger than others...");
	else if(n2>n1 && n2>n3)
		System.out.println("...Second value is larger than others...");
	else
		System.out.println("...Third value is larger tahan others...");
}
}
