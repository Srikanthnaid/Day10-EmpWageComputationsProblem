package EmpWage;

public class EmployeeWageComputation {
	public static void main(String[] args) {

		EmployeeWageChildClass employeeWage = new EmployeeWageChildClass();

		employeeWage.addEmpWage("D-Mart", 20, 10, 50);
		employeeWage.addEmpWage("Star Home", 10, 15, 80);
		employeeWage.addEmpWage("infinity", 25, 20, 80);
		employeeWage.wagesForWorkingHourAndDays();
	}
}
