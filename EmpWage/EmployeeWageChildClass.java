package EmpWage;

public class EmployeeWageChildClass extends EmployeeWageParentClass {

	// Check Employee Attendance
	protected void employeeAttendance() {
		if (randomCheck == IS_PRESENT) {
			System.out.print("Employee is Present");
		} else {
			System.out.print("Employee is Absent");
		}
	}
}
