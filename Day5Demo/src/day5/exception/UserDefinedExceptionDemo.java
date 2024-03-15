package day5.exception;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		System.out.println("main starts");
		int age = 10;

		try {
			vote(age);
		} catch (NotEligibleForVote e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println("main ends");

	}

	static void vote(int age) throws NotEligibleForVote {
		if (age < 18) {
			NotEligibleForVote ex = new NotEligibleForVote("Not eligible for vote");
			throw ex;
		}
		System.out.println("Eligible");
	}

}
