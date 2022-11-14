package EmpWage;

public class EmployeeWageChildClass extends EmployeeWageParentClass {

	// Calculating employee wage using switch case statement
	protected void empWageSwitch() {
		System.out.println("--------Using Switch---------");
		employeeWageUsingSwitch();
		TotalWageInDay = WAGE_PER_HR * EMP_HRS;
		System.out.println("Total wage in Day : " + TotalWageInDay);
	}
}
