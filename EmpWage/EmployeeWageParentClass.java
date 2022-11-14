package EmpWage;

import java.util.Random;

public class EmployeeWageParentClass {

	// parent variable
	protected int randomCheck;
	protected int IS_PRESENT = 1;
	protected int WAGE_PER_HR = 20;
	protected int EMP_HRS;
	protected int TotalWageInDay;

	// generating random number
	protected void getRandomNumber() {
		Random num = new Random();
		randomCheck = num.nextInt(2);
	}

}