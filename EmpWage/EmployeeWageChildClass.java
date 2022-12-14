package EmpWage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EmployeeWageChildClass {

	// Constant variable
	protected static final int IS_FULL_TIME = 1;
	protected static final int IS_PART_TIME = 2;

	protected ArrayList<EmployeeWageParentClass> getEmpList;
	private Map<String, EmployeeWageParentClass> companyToEmpWageMap;

	public EmployeeWageChildClass() {
		getEmpList = new ArrayList<>();
		companyToEmpWageMap = new HashMap<>();
	}

	public void addEmpWage(String company, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
		EmployeeWageParentClass employeeWageParentClass = new EmployeeWageParentClass(company, WAGE_PER_HR,
				MAX_WORKING_DAYS, MAX_HRS_IN_MONTH);
		getEmpList.add(employeeWageParentClass);
		companyToEmpWageMap.put(company, employeeWageParentClass);
	}

	public void wagesForWorkingHourAndDays() {
		for (int i = 0; i < getEmpList.size(); i++) {
			EmployeeWageParentClass employeeWageParentClass = getEmpList.get(i);
			employeeWageParentClass.setTotalEmpWage(this.wagesForWorkingHourAndDays(employeeWageParentClass));
			System.out.println(employeeWageParentClass);
		}
	}

	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).TOTAL_SALARY;
	}

	protected int wagesForWorkingHourAndDays(EmployeeWageParentClass employeeWageParentClass) {
		int EMP_HRS, TOTAL_WORKING_DAYS = 0, TOTAL_EMP_HRS = 0, TOTAL_SALARY = 0;
		while (TOTAL_WORKING_DAYS < employeeWageParentClass.MAX_WORKING_DAYS
				&& TOTAL_EMP_HRS < employeeWageParentClass.MAX_HRS_IN_MONTH) {
			Random num = new Random();
			int randomCheck = num.nextInt(2) + 1;
			switch (randomCheck) {
			case IS_FULL_TIME -> EMP_HRS = 8;
			case IS_PART_TIME -> EMP_HRS = 4;
			default -> EMP_HRS = 0;
			}
			TOTAL_EMP_HRS = TOTAL_EMP_HRS + EMP_HRS;
			TOTAL_WORKING_DAYS++;
		}
		TOTAL_SALARY = employeeWageParentClass.WAGE_PER_HR * TOTAL_EMP_HRS;
		return TOTAL_SALARY;
	}
}
