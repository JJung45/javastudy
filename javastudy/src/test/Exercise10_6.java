package test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Exercise10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate mybirth = LocalDate.of(1995, 4, 5);
		LocalDate today = LocalDate.now();
		
		long pe = mybirth.until(today,ChronoUnit.DAYS);
		
		System.out.println("brith day = "+mybirth);
		System.out.println("today = "+today);
		System.out.println(pe+"days");

	}

}
