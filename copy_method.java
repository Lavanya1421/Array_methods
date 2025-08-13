package array_strings;
import java.util.Arrays;
public class copy_method {
	//import java.util.Arrays;
	    public static void main(String[] args) {
	        int[] copy = {2, 4, 5, 7, 8};
	        int[] new_copy = Arrays.copyOf(copy, 10);
	        System.out.println("Resized array: " + Arrays.toString(new_copy));
	        
	        //equals method
	        int array1[]= {67,78,56,90};
	        int array2[]= {67,78,56,90};
	        int s1[]= {'a','b'};
	        int s2[]={'a','c'};
	        
	        if(Arrays.equals(array2,array1))
	        {
	        	System.out.println("true");
	        }
	        else {
	        	System.out.println("false");
	        	
	        }
	        if(Arrays.equals(s1,s2))
	        {
	        	System.out.println("true");
	        }
	        else {
	        	System.out.println("false");
	        	
	        }
	        
	        
	    }
}
	