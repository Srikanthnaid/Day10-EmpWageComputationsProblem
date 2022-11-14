package EmpWage;

public class EmployeeWageComputation {
	public static void main(String[] args) {

		// creating object
		EmployeeWageChildClass employeeData = new EmployeeWageChildClass();

		// Getting Wages For Working Hour And Days for company
		employeeData.wagesForWorkingHourAndDays("D-Mart", 20, 10, 50);
		employeeData.wagesForWorkingHourAndDays("Star Home", 10, 15, 80);
	}
}
