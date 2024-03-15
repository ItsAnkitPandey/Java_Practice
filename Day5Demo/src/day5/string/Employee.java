package day5.string;

import java.util.Objects;

public class Employee {

	    private int empno;
	    private String name;
	    private double salary;

	    public Employee(int empno, String name, double salary){
	        super();
	        this.empno = empno;
	        this.name = name;
	        this.salary = salary;
	    }

	    public int getEmpno(){
	        return empno;
	    }
	    public void setEmpno(int empno){
	        this.empno = empno;
	    }
	    
	    public String getName(){
	        return name;
	    }
	    public void setName(String name){
	        this.name = name;
	    }

	    public double getSalary(){
	        return salary;
	    }

	    public void setSalary(double salary){
	        this.salary = salary;
	    }

		@Override
		public int hashCode() {
			return Objects.hash(empno, name, salary);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return empno == other.empno && Objects.equals(name, other.name)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}

		@Override
		public String toString() {
			return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + "]";
		}
	}

