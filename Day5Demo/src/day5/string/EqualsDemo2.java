package day5.string;

public class EqualsDemo2 {
	public static void main(String[] args){
        Employee emp1  = new Employee(101,"ankit", 89000);
        Employee emp2  = new Employee(102,"krish", 82000);
        Employee emp3  = new Employee(101,"ankit", 89000);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        if(emp1.equals(emp3)){
               System.out.println("same");
        }else{
               System.out.println("not same");
        }
    }
}
