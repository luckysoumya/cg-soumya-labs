package lab3;
import java.time.*;

public class Lab3Q7_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate pdate = LocalDate.of(1999, 8 ,01);
		LocalDate now = LocalDate.now();

		Period diff = Period.between(pdate, now);

		System.out.printf("\nDifference is %d years, %d months and %d days old", 
				diff.getYears(), diff.getMonths(), diff.getDays());

	}

}
