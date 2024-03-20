package task;

public class OutingDecider {
	
    private String employeeName;
    private int employeeAge;
    private String spouseName;
    private int spouseAge;

    // Constructor
    public OutingDecider(String employeeName, int employeeAge, String spouseName, int spouseAge) {
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.spouseName = spouseName;
        this.spouseAge = spouseAge;
    }

    // Method to decide outing
    public String outingChecker(int ageGap) {
        if (spouseName.equals("NA")) {
            if (employeeAge > 20) {
                return "Enjoy outing";
            } else {
                return "We are planning good for you";
            }
        } else {
            int maxAge = Math.max(employeeAge, spouseAge);
            int minAge = Math.min(employeeAge, spouseAge);
            int ageDifference = maxAge - minAge;
            if (ageDifference < ageGap) {
                return employeeName + " and " + spouseName + " - You are invited";
            }
        }
        return "";
    }

    // Main method for testing
    public static void main(String[] args) {
        OutingDecider outingDecider1 = new OutingDecider("John", 25, "NA", 0);
        System.out.println(outingDecider1.outingChecker(10)); // Testing scenario 1
        
        OutingDecider outingDecider2 = new OutingDecider("Alice", 30, "Bob", 29);
        System.out.println(outingDecider2.outingChecker(5)); // Testing scenario 2
    }
}