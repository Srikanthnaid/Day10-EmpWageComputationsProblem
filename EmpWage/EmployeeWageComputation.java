package EmpWage;

public class EmployeeWageComputation {
	public static void main(String[] args) {

		 //creating object for child class
        EmployeeWageChildClass employeeData = new EmployeeWageChildClass();

        //Getting random number
        employeeData.getRandomNumber();

        //Getting employee wage using switch
        employeeData.empWageSwitch();
    }
}
