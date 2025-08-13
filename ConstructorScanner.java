package crt;

import java.util.Scanner;

class Huu {
	String Name;
	int Num;
	Huu(String na,int no)
	{
		Name=na;
		Num=no;
	}
    void display()
    {
    	System.out.println("Name =" + Name );
    	System.out.println("Number= " + Num);
    }
}
public class ConstructorScanner {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Name :");
		 String N1=scanner.nextLine();
		 System.out.println("Enter Number :");
		 int N2=scanner.nextInt();
		 Huu obj1=new Huu(N1,N2);
		 obj1.display();
		
		 scanner.close();
	}
}
