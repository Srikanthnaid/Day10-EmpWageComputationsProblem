package EmpWage;

public class EmployeeWageChildClass extends EmployeeWageParentClass {

	  //calculating daily wage of part time employee
    protected void partTimeEmployeeWage(){
        System.out.println("--------Part Time---------");
        if (randomCheck == IS_FULL_TIME) {
            EMP_HRS = 8;
        }
        else if (randomCheck == IS_PART_TIME) {
            EMP_HRS = 4;
        }
        else {
            EMP_HRS = 0;
        }
        TotalWageInDay = WAGE_PER_HR * EMP_HRS;
        System.out.println("Total wage in Day : "+TotalWageInDay);
    }
}
