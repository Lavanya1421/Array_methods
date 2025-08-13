package crt;
import java.util.*;
public class Switch {
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter a value: ");
int a=scanner.nextInt();
System.out.println("Enter b value : ");
int b=scanner.nextInt();
System.out.println("Enter an operator(+,-,*,/,%) :");
char operator=scanner.next().charAt(0);
switch(operator) {
	case '+':
		System.out.println("Sum is:"+(a+b));
		break;
	case'-':
		System.out.println("Subtraction is: "+(a-b));
		break;
	case'*':
		System.out.println("Multiplication is :" +(a*b));
		break;
	case'/':
		if(b!=0)
		System.out.println("division is:"+ (double)(a/b));
		else
			System.out.println("error:Division by zero");
		break;
	case'%':
		System.out.println("Modular division is:"+(a%b));
		break;
	default:
		System.out.println(" ....Invalid operator....");
   }

}
}
