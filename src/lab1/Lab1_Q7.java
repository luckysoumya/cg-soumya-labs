package lab1;
import java.util.Scanner;

public class Lab1_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		   boolean flag = false;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter a number : ");
		   number = sc.nextInt(); 
		   int currentDigit = number % 10;
		   number = number/10;  
		   while(number>0){
		       
			   if(currentDigit <= number % 10){
		           flag = true;
		           break;
		       }
		       currentDigit = number % 10;
		       number = number/10;
		   }
		   if(flag){
		       System.out.println("Digits are not in increasing order.");
		      
		   }
		   else{
		       System.out.println("Digits are in increasing order.");
		   }

	}

}
