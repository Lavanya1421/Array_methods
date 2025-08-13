package array_strings;

import java.util.Arrays;
public class array_methods {
	public static void main(String args[])
	{
//int a[]= {10,2,3,56};
//marks for sorting 
int marks[]= {57,89,67,98,45,78};
//for(int i=0;i<a.length;i++)
{
//System.out.println(a[i]);
//System.out.println(Arrays.toString (a));
//System.out.println(Arrays.sort(a));
	 }

for(int j=0;j<marks.length;j++)
	Arrays.sort(marks);
{
	System.out.println(Arrays.toString(marks));
	
}
// finding second largest element 
int a[]= {10,2,56,56};
Arrays.sort(a);
int largest=a[a.length-1];
for (int i=a.length-2;i>=0;i--)
{
	if(a[i]!=largest)
	{
	
		System.out.println(a[i]);
		return;
	}
	
	}

int[] copy= { 2,4 ,5,7,8};
int[]new_copy =Arrays.copyOf(copy, 10);
//Arrays.toString(new_copy);
System.out.println("resized array:"+Arrays.toString(new_copy));


int[] copy1 = {2, 4, 5, 7, 8};
int[] new_copy1 = Arrays.copyOf(copy1, 10);  // New array with length 10

System.out.println("Resized array: " + Arrays.toString(new_copy1));


}

}
