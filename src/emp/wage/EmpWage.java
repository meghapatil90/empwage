package emp.wage;

import java.util.Random;

public class EmpWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program.");
		Random random = new Random();
		int attendance = random.nextInt(2);
		int PRESENT = 1;

		if (attendance == PRESENT)
			System.out.println("Employee is Present!");
		else
			System.out.println("Employee is Absent!");

	}
}