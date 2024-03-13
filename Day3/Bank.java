class Account{
int accno;
ch name;
double balance;

void deposit(double amount){
balance = balance+amount;
}

void withdraw(double amount){
balance = balance - amount;
}

class Bank {
 	public static void main(String[] args){
Account acc1 = new Account();

acc1.accno = 10025;
acc1.name = "ankit";
acc1.balance = 85000;

acc1.withdraw(5000);

System.out.println("Current Balance: " + acc1.balance);
}
}

}