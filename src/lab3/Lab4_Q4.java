package lab3;
import java.util.*;

public class Lab4_Q4 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int min=9,max=0,number,digit,diff;
	        System.out.println("Enter any Integer Number : ");
	        number=sc.nextInt();
	        while(number>0)
	        {
	            digit=number%10;
	            number=number/10;
	        }
	        diff=max-min;
	       
	        System.out.println("Difference  Between consecutive numbers  Digit : "+diff);    

	}

}
