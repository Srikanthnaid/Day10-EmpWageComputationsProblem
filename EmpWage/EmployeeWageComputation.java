package EmpWage;

public class EmployeeWageComputation {
	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation Program using OOP");

		// creating object for child class
		EmployeeWageChildClass employeeData = new EmployeeWageChildClass();

		// Getting random number
		employeeData.getRandomNumber();

		// Checking for employee attendance
		employeeData.employeeAttendance();
	}
}
