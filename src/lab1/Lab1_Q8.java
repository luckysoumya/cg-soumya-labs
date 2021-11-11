package lab1;
import java.util.Scanner;

public class Lab1_Q8 {

	public class powerof2 {
		static boolean isPowerOfTwo(int n)
	    {
	        if (n == 0)
	            return false;
	          
	        while (n != 1)
	        {
	            if (n % 2 != 0)
	                return false;
	            n = n / 2;
	        }
	        return true;
	    }
	  
	    
	     public static void main(String args[])
	    {
	    	System.out.println("Enter number");
	    	Scanner sc = new Scanner(System.in);
	    	int n = sc.nextInt();
	    	 if (isPowerOfTwo(n))
	             System.out.println(" The given number " + n +" power of two "  );
	         else
	             System.out.println("The given number " + n +" not power of two");
			
	    }

}
}
