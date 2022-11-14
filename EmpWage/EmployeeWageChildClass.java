package EmpWage;

public class EmployeeWageChildClass extends EmployeeWageParentClass {

	// Calculating Wages for a month
	protected void wagesForWorkingHourAndDays() {
		System.out.println("--------Wages for a month---------");
		while (TOTAL_WORKING_DAYS < MAX_WORKING_DAYS) {
			getRandomNumber();
			employeeWageUsingSwitch();
			TOTAL_WORKING_DAYS++;
		}
		System.out.println(TOTAL_EMP_HRS);
		TOTAL_SALARY = WAGE_PER_HR * TOTAL_EMP_HRS;
		System.out.println("Total Salary : " + TOTAL_SALARY);

	}

}
