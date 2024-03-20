package task;

import java.time.LocalDate;

public class EmployeeUtils {

	public static String generateEmployeeId(String lastName, String firstName, LocalDate dob) {

		String empId = "";

		empId += lastName.substring(0, Math.min(3, lastName.length())).toUpperCase();

		empId += firstName.substring(0, Math.min(2, firstName.length())).toUpperCase();

		empId += dob.getDayOfMonth();
		empId += dob.getMonthValue() < 10 ? "0" + dob.getMonthValue() : dob.getMonthValue();
		empId += dob.getYear() % 100;

		return empId;

	}

}