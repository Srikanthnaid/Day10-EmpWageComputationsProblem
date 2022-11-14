package EmpWage;

public class EmployeeWageChildClass extends EmployeeWageParentClass {

    //Calculating Daily wage of Employee
    protected void dailyEmployeeWage(){
        System.out.println("--------Daily Wage---------");
        if (randomCheck == IS_PRESENT) {
            EMP_HRS = 8;
        }
        else {
            EMP_HRS = 0;
        }
        TotalWageInDay = WAGE_PER_HR * EMP_HRS;
        System.out.println("Total wage in Day : "+TotalWageInDay);
    }
}
