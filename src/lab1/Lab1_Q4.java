package lab1;
import java.util.Scanner;
public class Lab1_Q4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int n;
		int p;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = s.nextInt();
		for (int i = 2; i < n; i++) {
			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					p = 1;
			}
			if (p == 0)
				System.out.println(i);

		}
	}

}
