package EmpWage;

import java.util.Random;

public class EmployeeWageParentClass {

	// parent variable
	protected int randomCheck;
    protected int IS_FULL_TIME = 1;
    protected int IS_PART_TIME = 2;
    protected int WAGE_PER_HR=20;
    protected int EMP_HRS;
    protected int TotalWageInDay;

	// generating random number
	protected void getRandomNumber() {
		Random num = new Random();
		randomCheck = num.nextInt(2)+1;
	}

}