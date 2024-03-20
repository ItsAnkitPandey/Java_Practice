package enums;

import java.time.LocalDate;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpId(101);
		emp1.setName("Ankit");
		emp1.setDob(LocalDate.of(2001, 06, 02));
		emp1.setRole(Role.MANAGER);
		emp1.setSalary(22000);
		
		System.out.println("EmpID: "+ emp1.getEmpId());
		System.out.println("Name: "+ emp1.getName());
		System.out.println("DOB: "+ emp1.getDob());
		System.out.println("Role: "+ emp1.getRole());
		System.out.println("Salary: "+ emp1.getSalary());

	}

}
