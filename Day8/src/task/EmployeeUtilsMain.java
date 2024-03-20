package task;

import java.time.LocalDate;

public class EmployeeUtilsMain {

	public static void main(String[] args) {
		EmployeeUtils emp1 = new EmployeeUtils();
		
		String lastName = "Doe";
		String firstName = "John";
		LocalDate dob = LocalDate.of(1995, 5, 15);
		String empId = EmployeeUtils.generateEmployeeId(lastName, firstName, dob);
		System.out.println(empId);

	}

}
