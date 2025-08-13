package crt;

public class Reverse {

	public static void main(String args[])
	{
		int n=123458,rev=0;
		System.out.println(n);
		while(n!=0)
		{
			int i=n%10;
			rev=rev*10+i;
			n/=10;
		}
		System.out.println("Reverse value is:"+rev);
	}
}
