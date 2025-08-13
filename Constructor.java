package crt;

 class Hee {
 int Num;
 String Name;
 Hee(int Number,String Person){
 Num=Number;
 Name=Person;
}
void display()
{
	System.out.println("Name is:"+Name);
	System.out.println("Contact Number is:"+Num);
}
 }
 public class Constructor{
	 public static void main(String args[]) 
	 {
		 Hee obj1=new Hee(8688,"Susmitha");
		 obj1.display();
		 Hee obj2=new Hee(8680,"chinni");
		 obj2.display();
	 }
 }