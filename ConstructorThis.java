package crt;
import java.util.*;
class Heehuu{
	String Name;
	int Num;
	Heehuu(String Name, int Num)
	{
		this.Name=Name;
		this.Num=Num;
	}
	void display() {
		System.out.println("Name :"+this.Name);
		System.out.println("Num : "+this.Num);
	}

}
public class ConstructorThis{
	public static void main(String args[])
	{
		//Heehuu obj=new Heehuu("Susmitha",868688);
		//obj.display();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String Name=scanner.nextLine();
		System.out.println("Enter Number:");
		int Num=scanner.nextInt();
		Heehuu obj=new Heehuu(Name,Num);
		obj.display();
	}
}
