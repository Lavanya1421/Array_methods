package crt;
import java.util.*;
public class Arthmetic {
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter A value:");
	int A=scanner.nextInt();
	System.out.println("Enter B value:");
	int B=scanner.nextInt();
	System.out.println("Sum of "+ A + " & " + B + " Value is : " + (A+B));
	System.out.println("Sub of "+ A + " & " + B + " Value is : " + (A-B));
	System.out.println("Mul of "+ A + " & " + B + " Value is : " + (A*B));
	System.out.println("Div of "+ A + " & " + B + " Value is : " + (A/B));
	System.out.println("Modulus of "+ A + " & " + B + " Value is : " + (A%B));
}
}
